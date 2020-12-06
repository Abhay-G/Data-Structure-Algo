import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

           Scanner s = new Scanner(System.in);
           String str = s.next();
           String op = "";
           printSS(str,op);
           
    }

    public static void printSS(String str, String op) {
        
        
        if(str.length()==0)
        {
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        char ch = str.charAt(0);
        str = str.substring(1);
        op2 = op+ch;
        printSS(str,op2);
        printSS(str,op1);
        
        
    }

}
