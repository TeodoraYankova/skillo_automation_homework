package L2_PrimitiveDataTypesVariables;

import java.util.Scanner;

public class PrimitiveDataTypesVariables {
    public static void main(String[] args) {

       printName();
//
//        printTriangleParameter();
//
//        printAriaOfATriangle();
//
//        printPineTree();

//        triangleParameter();

//        areaOfATriangle();

//       quadraticEquation();

//        minutesInDaysAndYears();

    }

    private static void printName() {

        String firstName = "Teodora ";
        String middleName = "Branimirova ";
        String lastName = "Yankova ";

        String fullName = firstName + middleName + lastName;

        System.out.println(fullName);

    }

    private static void printTriangleParameter() {

        double a = 4.1;
        double b = 4.4;
        double c = 5.53;

        double parameter = a + b + c;

        System.out.println(parameter);

    }

    private static void printAriaOfATriangle() {

        int a = 5;
        int b = 7;
        int c = 11;

        int area = a + b + c / 2;

        System.out.println(area);

    }

    private static void printPineTree() {

        int height = 10;

        for (int i = 1; i <= height; i++) {
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= i * 2 - 1; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int space = 1; space <= 8; space++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= 2; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }


    }

    private static void triangleParameter() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        int perimeter = a + b + c;
        System.out.println("Perimeter: " + perimeter);

    }

    private static void areaOfATriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();

        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        int area = a + b + c / 2;

        System.out.println("The area of the triangle is: " + area);

    }

    private static void quadraticEquation() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextInt();

        System.out.println("Enter b: ");
        double b = scanner.nextInt();

        System.out.println("Enter c: ");
        double c = scanner.nextInt();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("root 1 is: " + root1);
            System.out.println("root 2 is: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("root is: " + root);
        } else {
            System.out.println("no real roots exist");
        }
    }

    private static void minutesInDaysAndYears() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();

        int days = minutes / 1440;
        int years = days / 365;
        days = days % 365;

        System.out.println(minutes + " minutes are " + days + " day/s and " + years + " year/s");

    }

}