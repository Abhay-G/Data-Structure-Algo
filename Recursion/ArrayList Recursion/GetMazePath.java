import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();
       int col = sc.nextInt();
       ArrayList<String> ans = getMazePaths(0,0,row- 1,col-1);
       System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
         if(sr > dr || sc > dc){//ye krlo ya phir call se phle check krlo condition.
            return new ArrayList<>();// ki sc<dc tbhi horizontal call lagao aur agr sr<dr tbhi vertical call lagao.
        }
        else if(sr==dr && sc==dc)
        {
             ArrayList<String> bres = new ArrayList<>();
             bres.add("");
             return bres;
        }
        
        ArrayList<String> rresv = getMazePaths(sr+1,sc,dr,dc);
        ArrayList<String> rresh = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> mres = new ArrayList<>();
        for(String sh : rresh)
        {
            mres.add("h"+sh);
            
        }
         for(String sv : rresv)
        {
            mres.add("v"+sv);
        }
        
        return mres;
    }

}
