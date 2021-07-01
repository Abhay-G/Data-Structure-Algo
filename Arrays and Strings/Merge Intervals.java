class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        for(int[] interval: intervals){
            if(res.size()==0){
                res.add(interval);
            }else{
                int[] prev = res.get(res.size()-1);
                if(prev[1]>=interval[0]){
                   prev[1] = Math.max(prev[1], interval[1]);
                }else{
                    res.add(interval);
                }
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
