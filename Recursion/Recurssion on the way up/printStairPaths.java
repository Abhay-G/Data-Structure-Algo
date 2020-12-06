import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         printStairPath(n,"");
    }

    public static void printStairPath(int n, String path) {
        
        if(n==0)
        {
            System.out.println(path);
            return;
        }
        else if(n<0)
        {
            return;
        }
       for(int i = 1;i<=3;i++)
       {
           printStairPath(n-i ,path+i);
       }
        
    }

}
