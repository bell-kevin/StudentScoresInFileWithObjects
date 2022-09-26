/** ****************************************************************************
 * Student.java
 * Kevin Bell
 *
 * The class manages a student.
 **************************************************************************** */
package mod3comp;

import java.io.*;

/**
 *
 * @author 4800590195
 */
public class Student implements Serializable {

    double score;
    String name;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    } // end constructor
//******************************************************************************

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }
    @Override
    public String toString(){
        return "i don't know what I'm doing";
    }
} // end Student class
