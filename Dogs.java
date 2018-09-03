package nested;

public class Dogs {                         //outer class
    private int age = 5;
    public String color = "Brown";
    private int hieghtInInch = 25;

    class Breed{                            //inner class
        private String breed1 = "Boxer";
        public void display(){
            //Accessing variables form outer class
            System.out.println("Dog Breed:"+breed1+"\n"+"Age:"+age+"\n"+"Color:"+
                    color+"\n"+"Height:"+hieghtInInch);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        Dogs.Breed b1 = d1.new Breed();
        b1.display();
    }
}