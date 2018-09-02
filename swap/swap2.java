package swap;

public class swap2 {
    public static void main(String[] args) {
        int[] array = {8, 5, 9, 1, 3, 4, 6};
       int min,index=0;
       for(int i=0;i<array.length;i++){
           min=array[i];
           for (int j=i;j<array.length;j++){
               if (min>array[j]){
                   min=array[j];
                   index=j;
                   System.out.println(min+ " "+ array[j]);
               }
               System.out.println(min+ " " +i);
               if (min<array[i]){
                   int temp = array[i];
                   array[i]=min;
                   array[index]=temp;
               }
               for(int k:array) System.out.println(k+ " ");
               System.out.println("\n");
           }
       }





        int num1 = array[0];
        int num2 = array[3];
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("");

    }
}

