import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        for(int i=1;i<10;i++){
           
            print(i,n);
        }
	   
	}
	
	public static void print(int num , int n){
	    if(num>n){
	        return;
	    }
	    
	    System.out.println(num);
	    for(int i=0;i<10;i++){
	         if(10*num+i > n)
            return;
	        print(num*10+i, n);
	    }
	}
	
}
