package L4_OperationsExpressionsConditionalStatementsLoops;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OperationsExpressionsConditionalStatementsLoops {

    public static void main(String[] args) {

        DaysOfWeek();
//        UserAge();
//        CalculateRevenue();
//        LargestNumber();
//        Vacation();
//        DivisibleBy5();
//        ReverseList();
    }


    private static String dayAbbreviation(int day) {

        return switch (day) {
            case 1 -> "-st";
            case 2 -> "-nd";
            case 3 -> "-rd";
            case 4, 5, 6, 7 -> "-th";
            default -> "Invalid day ";
        };
    }

    private static void DaysOfWeek() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        String daysOfWeek;

        switch (dayNumber) {

            case 1:
                daysOfWeek = "Monday";
                break;

            case 2:
                daysOfWeek = "Tuesday";
                break;
            case 3:
                daysOfWeek = "Wednesday";
                break;

            case 4:
                daysOfWeek = "Thursday";
                break;
            case 5:
                daysOfWeek = "Friday";
                break;
            case 6:
                daysOfWeek = "Saturday";
                break;
            case 7:
                daysOfWeek = "Sunday";
                break;
            default:
                daysOfWeek = "Invalid day";
        }

        String abb = dayAbbreviation(dayNumber);
        System.out.println("The " + dayNumber + abb + " day of the week is " + daysOfWeek);
    }

    private static void UserAge() {
        System.out.println("How old are you? ");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work!");
        } else {
            System.out.println("You must be over 16 to work! ");
        }

    }

    private static void CalculateRevenue() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double revenue = unitPrice * quantity;
        double discount = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discount = revenue * 0.15;
        } else if (quantity > 120) {
            discount = revenue * 0.20;
        }

        double finalRevenue = revenue - discount;

        System.out.println("The revenue from sale: " + finalRevenue + "$");
        System.out.println("Discount: " + discount + "$ (" + (discount / revenue * 100) + "%)");


    }

    private static void LargestNumber() {
        int[] numbers = {5, 55, 44, 20};
        int largestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largestNumber);

    }


    private static void Vacation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where do you want to go beach or mountain?");
        String vacationType = scanner.nextLine();

        System.out.println("What is your budget?");
        double budget = scanner.nextDouble();

        if (vacationType.equalsIgnoreCase("beach")) {
            if (budget < 50) {
                System.out.println("I recommend going to Bulgaria for your beach vacation!");
            } else {
                System.out.println("I recommend going outside Bulgaria for your beach vacation!");
            }
        } else if (vacationType.equalsIgnoreCase("mountain")) {
            if (budget < 30) {
                System.out.println("I recommend going to Bulgaria for your mountain vacation!");
            } else {
                System.out.println("I recommend going outside Bulgaria for your mountain vacation!");
            }
        } else {
            System.out.println("There is no information about this type of vacation.");
        }

    }

    private static void DivisibleBy5() {

        //    List<Integer> list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200];

        List<Integer> list1 = Arrays.asList(12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200);

        for (int number : list1) {
            if (number > 150) {
                break;
            }

            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void ReverseList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> reversedList = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            reversedList.add(list1.get(i));
        }

        System.out.println("Original Lists: " + list1);
        System.out.println("Reversed Lists: " + reversedList);
    }
}

