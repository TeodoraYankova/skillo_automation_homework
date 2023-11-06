package L7_ConstructorsExceptions;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
public class FixThisCode {
    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }
    protected static void closeFileWriter(FileWriter fileWriter) throws IOException {
        //closeFileWriter();
        fileWriter.close();
    }
    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++) {
            fileWriter.write(text + "\n");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        String textToAdd = scanner.nextLine();
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();

        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
//        FileWriter fileWriter = getFileWriter(filePath);
//        closeFileWriter(fileWriter);
    }
}

//Test:
// test.txt
// add this text
// repeat 5 times