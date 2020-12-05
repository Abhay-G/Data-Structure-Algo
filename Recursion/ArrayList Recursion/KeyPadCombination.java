import java.io.*;
import java.util.*;

public class KeyPadCombination{

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList < String > ans = getKPC(str);
        System.out.println(ans);
    }

    static String[] codes = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };
    public static ArrayList < String > getKPC(String str) {

        if (str.length() == 0) {
            ArrayList < String > bres = new ArrayList < > ();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        str = str.substring(1);
        ArrayList < String > rres = getKPC(str);
        ArrayList < String > mres = new ArrayList < > ();
        String codeforch = codes[ch - '0'];
        for (int i = 0; i < codeforch.length(); i++) {
            char c = codeforch.charAt(i);
            for (String s: rres) {
                mres.add(c + s);
            }
        }

        return mres;
    }

}
