package problem.solving;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int level=10;

        for(int i=0;i<level;i++){
            for(int j=0;j<level-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
