import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      ArrayList<String> ans  = getStairPaths(n);
      System.out.println(ans);
      
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0)
        {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
            
        }
        ArrayList<String> rres1 = getStairPaths(n-1);
        ArrayList<String> rres2 = getStairPaths(n-2);
        ArrayList<String> rres3 = getStairPaths(n-3);
        
        ArrayList<String> mres = new ArrayList<>();
         
         for(String s1:rres1)
         {
             mres.add("1"+s1);
         }
         for(String s2:rres2)
         {
             mres.add("2"+s2);
         }
         for(String s3:rres3)
         {
             mres.add("3"+s3);
         }
         return mres;
        
    }

}
