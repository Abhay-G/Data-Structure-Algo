import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         
         Scanner s= new Scanner(System.in);
         String str = s.next();
         printEncodings(str,"");
    }
    
    static String[] codes = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static void printEncodings(String str, String op) {
        
        
        if(str.length()<=0)
        {
            System.out.println(op);
            return;
        }
        else if(str.length()==1)
        {
            char ch = str.charAt(0);
            if(ch=='0')
            {
                return;
            }
            else{
                op = op+codes[ch-'0'-1];
                System.out.println(op);
                return;
            }
        }
        else{
    
    
    // first call
        char fcall = str.charAt(0);
        String frem = str.substring(1);
         if(fcall=='0')
         {
             return;
         }
        else{
            printEncodings(frem,op+codes[fcall-'0'-1]);
        }
     // second call  
        String scall = str.substring(0,2);
        String srem = str.substring(2);

        if(Integer.valueOf(scall)<=26)
        {
             printEncodings(srem,op+codes[Integer.valueOf(scall)-1]);
        }
   
    }

  }
}
