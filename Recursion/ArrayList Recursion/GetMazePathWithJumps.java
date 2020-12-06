import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        ArrayList<String> ans = getMazePaths(0,0,row-1,col-1);
        System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sc>dc||sr>dr)
        {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        // is code me upper wali condition check krne ki zaroorat hi ni hai, kyunki
        // vo condition kabhi aayegi hi ni, kyunki apn phle hi wahi tk ka path nikal rhe hai
        // jahan tak ka possible h , for loop me condition check krke.
        // but mene fr bhi likh dia h koi problem ni hai.
        else if(sr==dr && sc==dc)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> mres = new ArrayList<>();
        for(int ms=1;ms<= dc-sc; ms++)
        {
            ArrayList<String> hpaths = getMazePaths(sr,sc+ms,dr,dc);
            for(String hpath: hpaths)
            {
                mres.add("h"+ms+hpath);
            }
            
        }
        for(int ms=1;ms<=dr-sr;ms++)
        {
            ArrayList<String> vpaths = getMazePaths(sr+ms,sc,dr,dc);
            for(String vpath: vpaths)
            {
                mres.add("v"+ms+vpath);
            }
        }
         for(int ms=1;ms<=dr-sr && ms<=dc-sc;ms++)
        {
            ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String dpath: dpaths)
            {
                mres.add("d"+ms+dpath);
            }
        }

        return mres;
    }

}
