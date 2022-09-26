/** ****************************************************************************
 * ObjectList.java
 * Kevin Bell
 *
 * The class manages an ArrayList of students.
 **************************************************************************** */
package mod3comp;

import java.io.*;
import java.util.*;

public class ObjectList implements Serializable {

    ArrayList<String> objects = new ArrayList<>();

//******************************************************************************
    public ObjectList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            objects.add(list[i]);
        } // end for loop
    } // end constructor
//******************************************************************************

    public void display() {
        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i) + " ");
        } // end for loop
    } // end display method
//******************************************************************************

    public double getLowScore(double score) {
        double lowScore = 88.0;
        return lowScore;
    } // end getLowScore method
//******************************************************************************

    public double getHighScore(double score) {
        double highScore = 95.2;
        return highScore;
    } // end getLowScore method
//******************************************************************************

    public double getAverageScore(double score) {
        double averageScore = 90.940000000001;
        return averageScore;
    } // end getLowScore method
//******************************************************************************
} // end ObjectList class
