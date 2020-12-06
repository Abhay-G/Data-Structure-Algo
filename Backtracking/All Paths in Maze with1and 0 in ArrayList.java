class main {
    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list=new ArrayList<>();// important part
        String psf = "";
        boolean visited[][] = new boolean[n][n];
        floodfill(m,list,0,0,psf,visited);
        return list;// important part
    }
     public static void floodfill(int[][] maze,ArrayList<String> list, int row, int col, String psf, boolean[][] visited){
        
        
        if(col<0||row<0||col==maze[0].length||row==maze.length||maze[row][col]==0||visited[row][col]==true)
        {
            return;
        }
        if(col==maze[0].length-1 && row==maze.length-1)
        { 
           list.add(psf);
            return;
        }
        visited[row][col] = true;
        
       
        floodfill(maze,list,row+1,col,psf+"D",visited);
         floodfill(maze,list,row,col-1,psf+"L",visited);
        floodfill(maze,list,row,col+1,psf+"R",visited);
        floodfill(maze,list,row-1,col,psf+"U",visited);
         
        visited[row][col] = false;
    }
}
