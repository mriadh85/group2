package swap;

public class SwapElement {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp;

        System.out.println("before swapping");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);

        temp = num1;//hold num1 in temp,put num1 value into temp
        num1 = num2;//assign num2 value to num1
        num2 = temp;//swap num1 into num2,put temp value to num2
        System.out.println("after swapping");
        System.out.println("Num 1 : " + num1);
        System.out.println("Num 2 : " + num2);
    }
}

