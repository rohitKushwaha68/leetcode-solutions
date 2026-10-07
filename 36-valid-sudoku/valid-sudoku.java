class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                if(!checkValid(board,i,j))
                    return false;
            }
        }
        return true;
    }

    public boolean checkValid(char[][] board,int r, int c){
        
       if(board[r][c]=='.')return true;

        for(int i=0;i<9;++i){

            if(c!=i && board[r][i]==board[r][c])return false;
            if(r!=i && board[i][c]==board[r][c])return false;

            if((3*(r/3)+(i/3))!=r && (3*(c/3)+(i%3))!=c &&board[3*(r/3)+(i/3)][3*(c/3)+(i%3)]==board[r][c])     return false;
        }
        return true;

    }
}
