package Loop;

public class UseOfForLoop {
    public static void main(String[] args) {


       /* int num = 0;
        for (num = 0; num <= 39; num++) {
            System.out.print(num + " ");
        }
        //System.out.println(" ");*/

       /* for (int i=11; i<=121; i++){
            if ((i%2)!=0){
                System.out.print(i + " ");
            }
        }

        for (int i=1; i<175;  i++){
            if ((i % 5) == 0){
                System.out.print(i + " ");
            }
        }

        for (int count=50; count>0; count--){
            System.out.print(count + " ");
        }

        for (int i=80; i>=20; i--){
            if ((i % 2)==0){
                System.out.print(i + " ");
            }

        }

        for (int i=1; i<200; i++){
            if ((i%2)==0 && (i%3)==0){
                System.out.print(i + " ");
            }
        }
*/
       /* int total=0;
        int k;
        for (k=1; k<=50; k++){
            total += k*k;
            System.out.println(total);
        }*/

/*
        int total=0;
        int k;
        int n =5;
        for (k=1; k<=n; k++){
            total += k*k*k;
            System.out.println(total);
        }*/

/*int result = 0;
int i;
for (i = 11, result = 1; i<20;i+=2){
    System.out.println(result);
}*/

        int lo = 1;
        int hi = 10;
        int result = 0;
        for (int i = lo; i <= hi; i++ ){
            result += i;
            System.out.println(result);
        }
    }

}
