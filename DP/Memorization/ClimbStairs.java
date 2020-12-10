import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        
        int t[] = new int[n+1];
        Arrays.fill(t,-1);
        
        
        int ans = getCount(n,t);
        System.out.println(ans);
        
        
    }
    
    static int getCount(int stairs,int[]t)
    {
        if(stairs<0)
        {
            return 0;
        }
        else if(stairs==0)
        {
            return 1;
        } if(t[stairs]!=-1)
        {
            return t[stairs];
        }
        
        int r1 = getCount(stairs-1,t);
        int r2 = getCount(stairs-2,t);
        int r3 = getCount(stairs-3,t);
        
        t[stairs] = r1+r2+r3;
        return r1+r2+r3;
        
    }
    
    

}
