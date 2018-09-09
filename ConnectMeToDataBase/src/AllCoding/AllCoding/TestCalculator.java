package src.AllCoding.AllCoding;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.addition(25, 20);
        Assert.assertEquals(45,result);
        int result2 = cal.subtraction(89, 34);
        Assert.assertEquals(55,result2);//

    }
}
