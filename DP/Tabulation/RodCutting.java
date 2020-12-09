
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  int te = sc.nextInt();
	  while(te-->0)
	  {
	      int len  = sc.nextInt();
	      int price[] = new int[len];
	      for(int i=0;i<len;i++)
	      {
	          price[i] = sc.nextInt();
	      }
	      
	      int l[] = new int[len];
	      for(int i=0;i<len;i++)
	      {
	          l[i] = i+1;
	      }
	      int t[][] = new int[len+1][len+1];
	      for(int i=0;i<=len;i++)
	      {
	          t[i][0] = 0;
	      }
	       for(int i=0;i<=len;i++)
	      {
	          t[0][i] = 0;
	      }
	      System.out.print(getMax(price,l,t,len));
	      System.out.println();
	  }
	}
	public static int getMax(int price[], int len[], int t[][], int leng)
	{
	    for(int i=1;i<leng+1;i++)
	    {
	        for(int j=1;j<leng+1;j++)
	        {
	            if(len[i-1]<=j)
	            t[i][j] = Math.max(price[i-1]+t[i][j-len[i-1]], t[i-1][j]);
	            else
	            t[i][j] = t[i-1][j];
	        }
	    }
	    return t[leng][leng];
	}
}
