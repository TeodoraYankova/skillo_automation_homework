package L5_DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class DataStructures {
    public static void main(String[] args) {

//        sumOfArray();
//        printElementsOfMatrix();
        matrixWithDynamicRows();
//        biggestElementArray();
//        reverseElementsInLinkedList();
//        sumOFTheDiagonalMatrix();
//        palindrome();

    }

    private static void sumOfArray() {
        int[] array = {4, 5, 6, 7, 8};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //  System.out.println(array);
        System.out.println("The sum is:" + sum);


    }

    private static void printElementsOfMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void matrixWithDynamicRows() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void biggestElementArray() {
        int[] array = {3, 5, 8, 4, 2};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The biggest element in the array is: " + max);

    }

    private static void reverseElementsInLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Collections.reverse(linkedList);

        System.out.println("Reversed LinkedList: " + linkedList);
    }

    private static int sumOFTheDiagonalMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static void printSum(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int diagonalSum = sumOFTheDiagonalMatrix(matrix);
        System.out.println("The sum of the diagonal elements is: " + diagonalSum);
    }

    private static void palindrome() {
        String word = "madam";
        if (isPalindrome(word)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}