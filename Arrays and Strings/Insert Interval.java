class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n = intervals.length;
        ArrayList<int[]> res = new ArrayList<>();
        if(n==0){
            res.add(newInterval);
            return res.toArray(new int[res.size()][]);
        }
        int i=0;
        while(i<n && newInterval[0]>intervals[i][0]){
            res.add(intervals[i]);
            i++;
        }
       
        if(res.size()==0 || intervals[i-1][1]<newInterval[0]){
            res.add(newInterval);
        }
        int []prev  = res.get(res.size()-1);
        if(prev[1]>=newInterval[0]){
           
            prev[1] = Math.max(prev[1], newInterval[1]);
        }
        while(i<n){
            int [] lastInres = res.get(res.size()-1);
            if(intervals[i][0]<=lastInres[1]){
                lastInres[1]  = Math.max(lastInres[1], intervals[i][1]);
            }else{
                res.add(intervals[i]);
            }
            i++;
        }
        return res.toArray(new int[res.size()][]);
        
    }
}
