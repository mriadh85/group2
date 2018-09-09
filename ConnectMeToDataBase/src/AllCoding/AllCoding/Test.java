package src.AllCoding.AllCoding;

public class Test{
    Day dy;

    public Test (){}
    public Test(Day dy){
        this.dy = dy;

    }

    public void dayIsLike(){
            switch(dy){
                case MONDAY:
                    System.out.println("This id monday");
                    break;
                case TUESDAY:
                    System.out.println("This id tuesday");
                    break;
                case WEDNESDAY:
                    System.out.println("This id wednesday");
                    break;

                 default:
                     System.out.println("Mid week days");
            }
        }

    public static void main(String[] args) {
        String st1 = "MONDAY";
        String st2 = "TUESDAY";
        String st3 = "FRI";
        System.out.println("rrrrrr");


        src.Test t1 = new src.Test(Day.valueOf("MONDAY"));
        t1.dayIsLike();
//        Test t2 = new Test(Day.valueOf(st2));
//        t2.dayIsLike();
//        Test t3 = new Test(Day.valueOf(st3));
//        t3.dayIsLike();
        System.out.println("today is sunday!");
    }


    public static class Dogs {                         //outer class
        private int age = 5;
        public String color = "Brown";//holy
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
}