import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x,n));
        
    }

    public static int power(int x, int n){
         if(n==0)
        {
            return 1;
        }
        else if(n==1)
        {
            return x;
        }
        if(n%2==0)
        {
           int ans = power(x,n/2);
           return ans*ans;
        }
        else if(n%2!=0)
        {
            return power(x,n-1)*x;
        }
        return 1;
       
    }

}
