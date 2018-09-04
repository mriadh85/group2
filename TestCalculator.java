package ClaPrac090218;

import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.Calendar;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.addition(25, 20);
        Assert.assertEquals(45,result);
        int result2 = cal.subtraction(89, 34);
        Assert.assertEquals(55,result2);

    }
}
