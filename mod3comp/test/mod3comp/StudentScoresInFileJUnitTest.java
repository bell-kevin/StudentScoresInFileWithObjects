/** ****************************************************************************
 * StudentScoresInFileJUnitTest.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
package mod3comp;

import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
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
    public Collection<Object[]> data() {
        Object[][] data = new Object[][]{
             {1, 99, 51, new Student[]{new Student("Anna", 99), new Student("Ben", 51)},
            {0, 100, 50, new Student[]{new Student("Kevin", 100), new Student("George", 0)},
            {2, 98, 74},
            {3, 97, 73},
            {4, 96, 72}
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

    @Test
    public void testHighScore() {
        Gradebook scores = new Gradebook(students);
        double actual = scores.getHighScore();
        double result = highScore;
        Assert.assertEquals(result, actual, 0.01);
    } // end testHighScore method

    @Test
    public void testAverageScore() {
        Gradebook scores = new ObjectList(sumOfScores, countOfScores);
        double actual = ObjectList.getAverageScore(sumOfScores / countOfScores);
        double result = sumOfScores / countOfScores;
        Assert.assertEquals(result, actual, 0.01);
    } // end testAverageScore method
} // end StudentScoresInFileJUnitTest class
