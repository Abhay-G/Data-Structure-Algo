import java.util.*;

public class Main {
  public static void display(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void solveSudoku(int[][] board, int i, int j) {
    // write yopur code here
    
    
    if(i==board.length){
        display(board);
        return;
    }
    int ni = 0;
    int nj = 0;
    if (j == board[0].length - 1) {
      nj = 0;
      ni = i + 1;
    } else {
      ni = i;
      nj = j + 1;
    }
    
    if(board[i][j]==0){
        for(int k = 1;k<=9;k++){
            if(isPossible(board, i, j, k)){
                board[i][j] = k;
                solveSudoku(board, ni, nj);
                board[i][j] = 0;
            }
        }
    }else{
        solveSudoku(board,ni,nj);
    }

  }
  
  public static boolean isPossible(int[][]board, int x, int y, int val){
      for(int j=0;j<9;j++){
          if(board[x][j] == val){
              return false;
          }
      }
      for(int i=0;i<9;i++){
          if(board[i][y] == val){
              return false;
          }
      }
      int smi = x / 3 * 3;
      int smj = y / 3 * 3;
      for(int i = 0; i<3;i++){
          for(int j=0; j<3;j++){
              if(board[smi+i][smj+j]==val){
                  return false;
              }
          }
      }
      
      return true;
      
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int[][] arr = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    solveSudoku(arr, 0, 0);
  }
}
