public class MyArray {
    public static void main(String[] args) {
        double[] myList = {6.7, 3.9, 4.8, 5.2};


        //This will print all the elements
        /*for (int i = 0; i < myList.length; i++){
            System.out.println(myList[i] + " ");
            //System.out.println(myList[i] ++);
            //System.out.println("myList = " + myList[i]);
        }*/
        for (double elements: myList){
            System.out.println(elements);
        }

        //Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is " + total);

        //Finding the largest element
        double max = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);


        //Finding the smallest elements
        double min = myList[0];
        for (int i = 0; i < myList.length; i++){
            if (myList[i] < min) min = myList[i];
        }
        System.out.println("min is " + min);
    }



}
