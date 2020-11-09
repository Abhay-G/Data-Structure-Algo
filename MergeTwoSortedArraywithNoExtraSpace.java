import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int a[] = {1, 3, 5, 7};
       int b[] = {0, 2, 6, 8, 9};
        
       merge(a,b,4,5);
       
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
	}
	public static void merge(int a[], int b[], int n, int m) {
        // code here
        double length = n+m;
        int temp = 0;
        
        double gap = Math.ceil(length/2);
        System.out.println(gap);
        while(gap>=1)
        {
            for(int i=0;i<(int)length&&i+(int)gap<(int)length;i++)
            {
                int k = (int)(i+gap);
                if(k<n)
                {
                    if(a[i]>a[k])
                    {
                       temp = a[i];
                       a[i] = a[k];
                       a[k]= temp;
                    }
                }
                else if(k>=n)
                {
                    
                    int index = k-n;
                    if(i<n){
                        if(a[i]>b[index])
                        {
                            temp = a[i];
                            a[i] = b[index];
                            b[index] = temp;
                        }
                    }
                    else{
                        
                        int iindex = i-n;
                          if(b[iindex]>b[index])
                        {
                            temp =b[iindex];
                            b[iindex]= b[index];
                            b[index] = temp;
                        }
                        
                    }
                    
                    
                }
            }
          
            
            if(gap == 1.0)
            {
                break;
            }
            gap = Math.ceil(gap/2);
           
             
        
        }
        
    }
}
