import java.util.*;

public class Main {
    
   
    public static void printPrimeUsingSieve(int n) {
       
       int seive[] = new int[n+1];
       for(int i=2; i*i<=n; i++){
           if(seive[i]==0){
               for(int j = i*i; j<=n; j+=i){
                   seive[j] = 1;
               }
           }
       }
       for(int i=2; i<=n;i++){
           if(seive[i]==0){
               System.out.print(i+" ");
           }
       }
       
    }

    // ~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~
    public static void main(String[] args) {   
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPrimeUsingSieve(n);
    }
}
