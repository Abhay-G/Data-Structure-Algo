import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        
        
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

}
