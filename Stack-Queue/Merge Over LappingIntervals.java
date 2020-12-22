import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        
        Pair[] pairs = new Pair[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            pairs[i] = new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++)
        {
            if(i==0)
            {
                st.push(pairs[i]);
            }
            else{
                Pair top = st.peek();
                if(pairs[i].start>top.end)
                {
                    st.push(pairs[i]);
                }
                else{
                    top.end = Math.max(top.end, pairs[i].end);
                }
            }
        }
        Stack<Pair> rs = new Stack<>();
        while(st.size()>0)
        {
            rs.push(st.pop());
        }
        while(rs.size()>0)
        {
            Pair p = rs.pop();
            System.out.println(p.start+" "+p.end);
        }
    }
    
public static class Pair implements Comparable<Pair>{
    int start;
    int end;
    
    public Pair(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    
    public int compareTo(Pair other)
    {
        if(this.start!=other.start)
        {
            return this.start-other.start;
        }
        else
        {
            return this.end-other.end;
        }
    }
}

}
