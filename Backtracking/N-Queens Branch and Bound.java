import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    boolean[][] board = new boolean[n][n];
    //write your code here
     boolean col[] = new boolean[n];
     boolean ndia[] = new boolean[2*n -1];
     boolean rdia[] = new boolean[2*n -1];
     
     solve(board,0, col, ndia, rdia,"");
  }
  public static void solve(boolean[][] board,int row, boolean col[], boolean ndia[], boolean rdia[], String asf){
      
      
      if(row == board.length){
          System.out.println(asf+".");
          return;
      }
     for(int c=0; c<board[0].length;c++)
     {
        if(col[c] == false && ndia[row+c]==false && rdia[row-c+board.length -1 ] == false){
          
            col[c] = true;
            ndia[c+row] = true;
            rdia[row-c+board.length -1] = true;
            solve(board, row+1, col, ndia, rdia, asf+row+"-"+c+", ");
            
            col[c] = false;
            ndia[c+row] = false;
            rdia[row-c+board.length -1] = false;
        }
     }
  }

}
