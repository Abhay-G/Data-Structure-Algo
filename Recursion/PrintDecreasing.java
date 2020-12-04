import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
         printDecreasing(n);
    }

    public static void printDecreasing(int n){
        
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

}
