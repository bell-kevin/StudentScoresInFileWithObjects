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
        double score;
        String name;
        int studentCount = 5;
        Student[] list = new Student[studentCount];
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter student name: ");
            name = computerKeyboardInput.next();
            System.out.print("Enter test score: ");
            score = computerKeyboardInput.nextDouble();
            list[i] = new Student(name, score);
        } // end for loop
        Gradebook gradebook = new Gradebook(list);
        String fileName = "gradeBook.txt";
        try (ObjectOutputStream fileOut // write object
                = new ObjectOutputStream(new FileOutputStream(fileName))) {
            fileOut.writeObject(gradebook);
            fileOut.reset();
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
        System.out.println("Data written to file");
        try (ObjectInputStream fileIn = new ObjectInputStream( // read object
                new FileInputStream(fileName))) {
            while (true) {
                gradebook = (Gradebook) fileIn.readObject();
                gradebook.display();
                System.out.println("Low score: " + gradebook.getLowScore());
                System.out.println("High score: " + gradebook.getHighScore());
                System.out.println("Avg score: " + gradebook.getAverageScore());
            } // end while loop
        } catch (EOFException e) { // terminates infinite while loop
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } // end try/catch, and close fileOut automatically
    } // end main method
} // end Mod3comp class
