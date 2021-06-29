import java.util.*;

public class Main {

    public static int[] getModifiedArray(int length, int[][] queries) {
       
       int res[] = new int[length];
       for(int q = 0; q<queries.length; q++){
           int start = queries[q][0];
           int end = queries[q][1];
           int query = queries[q][2];
           res[start] += query;
           if(end+1<length){
               res[end+1]-= query;
           }
       }
       //perfix sum
       int sum = 0;
       for(int i=0; i<length; i++){
           sum += res[i];
           res[i] = sum;
       }
       
       return res;
       
    }

    // ~~~~~~~~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~~~~

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int length = scn.nextInt();

        int nq = scn.nextInt();
        
        int[][] queries = new int[nq][3];

        for(int q = 0; q < nq; q++) {
            queries[q][0] = scn.nextInt();
            queries[q][1] = scn.nextInt();
            queries[q][2] = scn.nextInt();
        }


        int[] res = getModifiedArray(length, queries);

        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
