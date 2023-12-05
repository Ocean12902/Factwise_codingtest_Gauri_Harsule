// Sudoku puzzle by filling the empty cells.
public class Solution{
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolen solve(char[][] board){
        for(int i=0;i<9;i++)
         for(int j=0;j<9;j++){
             if(board[i][j]== '.'){
              for(int k=0;k<9;k++){
                board[i][j]=(char)('0'+k);
                if(checkSudoku(board,i,j)&&solve(board)) return true;
                board[i][j]='.';
              }
              return false;
             }
         }
         return true;     
    }
    public boolen checkSudoku(char[][] board,int row, int col){
        for(int i=0;i<9;i++)
           if(i!=row&&board[i][col]==board[row][col])
                return false;
        for(int j=0;j<9;j++)
           if(j!=row&&board[row][j]==board[row][col])
                return false;
        for(int i=3*(row/3);i<3*(row/3+1);i++)
            for(int j=3*(col3);j<3*(col/3+1);j++)
                if(i!=row&&j!=col&&board[i][j]==board[row][col])
                    return false;
        return true;   
    }
}