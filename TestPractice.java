package Practice;

public class TestPractice {
    public static void main(String[] args) {
        //data or value changes in all objects by changing in one place or data
        /*Emp.company = "PNT";
        Emp st = new Emp();
        st.name = "Tofael";
        st.salary = 10000;

        Emp st1 = new Emp();
        st1.name = "Shams";
        st1.salary = 20000;

        st.printDetails();
        st1.printDetails();

        st.salary = 30000;
        st.company = "google";
        System.out.println("\nAfter Change\n");
        st.printDetails();
        st1.printDetails();*/



        //data sharing
        /*Emp obj1=new Emp();
        Emp obj2=new Emp();
        Emp obj3=new Emp();
        obj1.increment();
        obj2.increment();
        obj3.increment();
        System.out.println("Obj1: count is="+obj1.count);
        System.out.println("Obj2: count is="+obj2.count);
        System.out.println("Obj3: count is="+obj3.count);*/




            Emp.age = 30;
            Emp.name = "Steve";
            Emp.disp();
    }






}
