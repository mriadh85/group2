package Practice081918;

public class TestNestedClass {
    public static void main(String[] args)
    {
        // accessing a static nested class
        NestedClass.StaticNestedClass nestedObject = new NestedClass.StaticNestedClass();

        nestedObject.display();

    }
}
