import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;
    private static final double dx = 1e-15;

    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void addNumber_test_right(){
        float a = 1;
        float b = 2;
        float groundTruth = 3;
        Assert.assertEquals(groundTruth, calculator.add(a, b),dx);
    }

    @Test
    public void addNumber_test_wrong(){
        float a = 2;
        float b = 2;
        float groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.add(a, b),dx);
    }

    @Test
    public void subNumber_test_right(){
        float a = 1;
        float b = 2;
        float groundTruth = -1;
        Assert.assertEquals(groundTruth, calculator.sub(a, b),dx);
    }

    @Test
    public void subNumber_test_wrong(){
        float a = 2;
        float b = 2;
        float groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.sub(a, b),dx);
    }

    @Test
    public void mulNumber_test_right(){
        float a = 1;
        float b = 2;
        float groundTruth = 2;
        Assert.assertEquals(groundTruth, calculator.multiply(a, b),dx);
    }

    @Test
    public void mulNumber_test_wrong(){
        float a = 2;
        float b = 2;
        float groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.multiply(a, b),dx);
    }

    @Test
    public void divNumber_test_right(){
        float a = 10;
        float b = 2;
        float groundTruth = 5;
        Assert.assertEquals(groundTruth, calculator.div(a, b), dx);
    }

    @Test
    public void divNumber_test_wrong(){
        float a = 10;
        float b = 2;
        float groundTruth = 3;
        Assert.assertNotEquals(groundTruth, calculator.div(a, b), dx);
    }

    @Test
    public void divNumber_test_wrong_io(){
        float a = 10;
        float b = 0;
        float groundTruth = -999999;
        Assert.assertEquals(groundTruth, calculator.div(a, b), dx);
    }
}