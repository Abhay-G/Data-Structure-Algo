class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s){
        ArrayList<int[]> arr = new ArrayList<>();
        int i=0;
        int j = 0;
        while(i<f.length && j<s.length){
            
            int start = Math.max(f[i][0], s[j][0]);
            int end = Math.min(f[i][1], s[j][1]);
            if(end>=start){
                int intersection[] = {start, end};
                arr.add(intersection);
            }
            if(f[i][1]>s[j][1]){
                j++;
            }else{
                i++;
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}
