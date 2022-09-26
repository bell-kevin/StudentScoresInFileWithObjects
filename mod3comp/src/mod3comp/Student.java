/** ****************************************************************************
 * Student.java
 * Kevin Bell
 *
 * The class manages a student.
 **************************************************************************** */
package mod3comp;

import java.io.*;

public class Student implements Serializable {

    double score;
    String name;
//******************************************************************************

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    } // end constructor
//******************************************************************************

    public String getName() {
        return this.name;
    } // end getName method
//******************************************************************************

    public double getScore() {
        return this.score;
    } // end getScore method
//******************************************************************************

    @Override
    public String toString() {
        return name + "\n" + this.score;
    } // end String override method
//******************************************************************************    
} // end Student class
