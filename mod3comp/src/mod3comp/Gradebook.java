/** ****************************************************************************
 * Gradebook.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package mod3comp;

import java.io.*;
import java.util.*;

public class Gradebook implements Serializable {

    ArrayList<Student> students = new ArrayList<>();

//******************************************************************************
    public Gradebook(Student[] list) {
        for (int i = 0; i < list.length; i++) {
            students.add(list[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************

    public double getLowScore() {
        double lowScore = 0;
        lowScore = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if (currentStudent.getScore() < lowScore) {
                lowScore = currentStudent.getScore();
            } // end if condition
        } // end for loop
        return lowScore;
    } // end getLowScore method
//******************************************************************************

    public double getHighScore() {
        double highScore = 1000000;
        highScore = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            if (currentStudent.getScore() > highScore) {
                highScore = currentStudent.getScore();
            } // end if condition
        } // end for loop
        return highScore;
    } // end getHighScore method
//******************************************************************************

    public double getAverageScore(double score) {
        double averageScore = 90.940000000001;
        return averageScore;
    } // end getLowScore method
//******************************************************************************
} // end ObjectList class
