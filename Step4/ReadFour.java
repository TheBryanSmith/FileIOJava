package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args)  {
        try {
            Scanner fileIn = new Scanner(new File("/Users/bryan/Desktop/zipcode Classwork/FileIOJava/Step4/input.txt"));
            int sum = 0;
            while (fileIn.hasNext()) {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                // Split the line into a String array
                String[] input = lineIn.split(",");

                for (int i = 0; i < input.length; i++) {
                    sum += Integer.parseInt(input[i]);
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
