/** ****************************************************************************
 * Mod3comp.java
 * Kevin Bell
 *
 * The program writes objects to a file, and reads objects from a file.
 **************************************************************************** */
package mod3comp;

import java.io.*;
import java.util.*;

public class Mod3comp {

    public static void main(String[] args) {
        System.out.println("Module 3 Student Scores by Kevin Bell \n");
        Scanner computerKeyboardInput = new Scanner(System.in);
        String stuff = "";
        String[] list = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8) {
                System.out.print("Enter student name: ");
                stuff = computerKeyboardInput.next();
                list[i] = stuff;
            } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {
                System.out.print("Enter test score: ");
                stuff = computerKeyboardInput.next();
                list[i] = stuff;
            } // end if/else if condition
        } // end for loop
        ObjectList objectList = new ObjectList(list);
        String fileName = "namesAndScores.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(objectList);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Data written to file");
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                objectList = (ObjectList) fileIn.readObject();
                objectList.display();
                System.out.println("Low score: " + objectList.getLowScore(0));
                System.out.println("High score: " + objectList.getHighScore(0));
                System.out.println("Average score: " + objectList.getAverageScore(0));
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Mod3comp class
