import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       String op = "";
       printKPC(str,op);
    }
     
     static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String op) {
        
       if(str.length()==0)
       {
           System.out.println(op);
           return;
       }
        
        char ch = str.charAt(0);
        int index = ch-'0';
        str = str.substring(1);
        for(int i=0;i<codes[index].length();i++)
        {
           char c = codes[index].charAt(i);
           printKPC(str,op+c);
        }
        
    }

}
