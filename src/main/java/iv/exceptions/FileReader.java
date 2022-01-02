package iv.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IncorrectFileNameException {
        readFileLine("readme2.md");
    }

    public static String readFileLine (String fileName) throws IncorrectFileNameException {
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine())
                return file.nextLine();
        } catch (FileNotFoundException e) {
            boolean correctFilename = false;
            correctFilename = isCorrectFileName(fileName);
            //            if (isCorrectFileName (fileName)) {
//                throw new IncorrectFileNameException("Incorrect filename: " + fileName);
//            }
            System.out.println("Exception: " + e);
        }
        return null;
    }

    public static boolean isCorrectFileName (String fileName) {
        boolean correct = false;
        if (!fileName.contains("[a-zA-Z]+"))
            correct = true;
        return correct;
    }
}
