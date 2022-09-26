/** ****************************************************************************
 * StudentScoresInFileJUnitTest.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package mod3competency;

import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import mod3comp.Gradebook;
import mod3comp.Student;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class StudentScoresInFileJUnitTest {

    public StudentScoresInFileJUnitTest() {
    }
    @Parameterized.Parameter(0)
    public double lowScore;
    @Parameterized.Parameter(1)
    public double highScore;
    @Parameterized.Parameter(2)
    public double averageScore;
    @Parameterized.Parameter(3)
    public Student[] students;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Student[] studentList = new Student[]{new Student("Anna",
            95.2), new Student("Ben", 89.1), new Student("Carl", 90.0),
            new Student("Debbie", 92.4), new Student("Emily", 88.0)};
        Student[] studentList2 = new Student[]{new Student("Anna", 21),
            new Student("Ben", 17)};
        Object[][] data = new Object[][]{
            {88.0, 95.2, 90.9400000000000001, studentList},
            {17, 21, 19, studentList2},
            {75, 99, 87, new Student[]{new Student("Juan", 99),
                new Student("Lupe", 75)}},
            {51, 98, 74.5, new Student[]{new Student("Sean", 98),
                new Student("Hannity", 51)}},
            {23, 97, 60, new Student[]{new Student("Tucker", 97),
                new Student("Carlson", 23)}}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testLowScore() {
        Gradebook scores = new Gradebook(students);
        double actual = scores.getLowScore();
        double result = lowScore;
        Assert.assertEquals(result, actual, 0.01);
    } // end testLowScore method
//******************************************************************************

    @Test
    public void testHighScore() {
        Gradebook scores = new Gradebook(students);
        double actual = scores.getHighScore();
        double result = highScore;
        Assert.assertEquals(result, actual, 0.01);
    } // end testHighScore method
//******************************************************************************

    @Test
    public void testAverageScore() {
        Gradebook scores = new Gradebook(students);
        double actual = scores.getAverageScore();
        double result = averageScore;
        Assert.assertEquals(result, actual, 0.01);
    } // end testAverageScore method
//******************************************************************************    
} // end StudentScoresInFileJUnitTest class
