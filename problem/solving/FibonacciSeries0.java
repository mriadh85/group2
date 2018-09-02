package problem.solving;

public class FibonacciSeries0 {
    public static void main(String[] args) {
        int next = 0; //next:1
                int prev=1;
        for(int i=0;i<10;i++){
            System.out.println(next);
            next=next+prev;
            prev=next-prev;

        }
    }
}
