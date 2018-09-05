package Practice;

public class Emp {
    ////data or value changes in all objects by changing in one place or data
    /*String name;
    int salary;
    static String company;

    public void printDetails(){
        System.out.println("Name: " +name);
        System.out.println("Company: " +company);
        System.out.println("Salary: " +salary);
    }*/


    //data sharing
    /*static int count = 0;

    public void increment() {
        count++;
    }*/

    static int age;
    static String name;
    //This is a Static Method
    static void disp(){
        System.out.println("Age is: "+age);
        System.out.println("Name is: "+name);
    }

}
