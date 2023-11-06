package L8_OOP_Employee;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    public int salaryPerMonth;

    public String getName() {
        return firstName + " " + lastName;

    }

    public int getAnnualSalary() {
        return salaryPerMonth * 12;
    }


    public int raiseSalary(int salaryPerMonth, int percentage) {
        int raiseAmount = salaryPerMonth*(percentage/100); //raise the salary with 0,10%
        int updateSalary = salaryPerMonth+raiseAmount;
        return updateSalary;

    }

    public String toString() {
        return "Employee ID: " + id + "\n" +
                "Name: " + getName() + "\n" +
                "Salary per Mont: $" + "\n" +
                "Annual Salary: $" + getAnnualSalary();
             //   "Updated salary: " = raiseSalary();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
    }


}
