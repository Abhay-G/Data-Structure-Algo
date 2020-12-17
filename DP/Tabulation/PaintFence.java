import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int same = k;
        int diff = k*(k-1);
        
        for(int i=3;i<=n;i++)
        {
            int ns = diff;
            int ndiff = (same+diff)*(k-1);
            
            same = ns;
            diff = ndiff;
        }
        System.out.println(same+diff);
    }
}
