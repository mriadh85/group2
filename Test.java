enum Day {
    MONDAY,TUESDAY,WEDNESDAY,FRI;
}

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


        Test t1 = new Test(Day.valueOf("MONDAY"));
        t1.dayIsLike();
//        Test t2 = new Test(Day.valueOf(st2));
//        t2.dayIsLike();
//        Test t3 = new Test(Day.valueOf(st3));
//        t3.dayIsLike();
    }


}