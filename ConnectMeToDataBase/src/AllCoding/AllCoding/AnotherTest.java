package src.AllCoding.AllCoding;

public class AnotherTest {
    enum color{
        RED, WHITE, BLUE
    }

    public static void main(String[] args) {
        color[] ary1 = color.values();
        for (color c: ary1
             ) {
            System.out.println(c +" is at "+c.ordinal());

        }

        System.out.println(color.valueOf("WHITE"));
    }
}
