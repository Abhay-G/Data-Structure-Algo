class Solution {
    public int findMinArrowShots(int[][] points) {
        int count = 1;
        if(points.length==1)return count;
        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        int end = points[0][1];
        for(int i=1; i<points.length;i++){
            
            if(end>=points[i][0]){
                continue;
            }else{
                end = points[i][1];
                count++;
            }
        }
        return count;
       
    }
}
