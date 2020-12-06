import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int r = s.nextInt();
       int c = s.nextInt();
       printMazePaths(0,0,r-1,c-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr==dr&&sc==dc)
        {
            System.out.println(psf);
            return;
        }
        
        
        for(int ms=1;ms<=dc-sc;ms++)
        {
            printMazePaths(sr,sc+ms,dr,dc,psf+"h"+ms);
        }
         for(int ms=1;ms<=dr-sr;ms++)
        {
            printMazePaths(sr+ms,sc,dr,dc,psf+"v"+ms);
        }
         for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++)
        {
            printMazePaths(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
        }
    }

}
