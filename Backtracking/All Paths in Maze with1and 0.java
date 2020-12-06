import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean visited[][] = new boolean[n][m];
        floodfill(arr,0,0,"",visited);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited){
        
        
        if(col<0||row<0||col==maze[0].length||row==maze.length||maze[row][col]==1||visited[row][col]==true)
        {
            return;
        }
        if(col==maze[0].length-1 && row==maze.length-1)
        {
            System.out.println(psf);
            return;
        }
        visited[row][col] = true;
        floodfill(maze,row-1,col,psf+"t",visited);
        floodfill(maze,row,col-1,psf+"l",visited);
        floodfill(maze,row+1,col,psf+"d",visited);
        floodfill(maze,row,col+1,psf+"r",visited);
         
        visited[row][col] = false;
    }
}
