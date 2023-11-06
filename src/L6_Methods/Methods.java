package L6_Methods;


import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

//        theSmallestNumber();
        averageOfThreeNumbers();
//        middleCarterOfString();
//        countAllWordsInString();
//        isEven();
//        palindrome();

    }

    private static void theSmallestNumber() {
        int num1 = 7;
        int num2 = 3;
        int num3 = 9;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }


    }

    private static void averageOfThreeNumbers() {
        int num1 = 7;
        int num2 = 4;
        int num3 = 5;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
    }

    private static void middleCarterOfString() {
        String str = "Text";
        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            String middleChars = str.substring(middleIndex - 1, middleIndex + 1);
            System.out.println("Middle carter is: " + middleChars);
        } else {
            char middleChar = str.charAt(middleIndex);
            System.out.println("Middle carter is: " + middleChar);
        }

    }

    private static void countAllWordsInString() {

    }

    private static boolean isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void palindrome() {
    }

}
