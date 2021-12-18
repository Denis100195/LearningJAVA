package InterviewQuestions;
/**Determine if a 9 x 9 Sudoku board is valid. Only the filled cells
 * need to be validated according to the following rules:

 Each row must contain the digits 1-9 without repetition.
 Each column must contain the digits 1-9 without repetition.
 Each of the nine 3 x 3 sub-boxes of the grid must contain the digits
 1-9 without repetition.
 * */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board[0].length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] != '.'){
                    char cur = board[i][j];

                    if(!reccheck(board, i, j)){
                        return false;
                    }

                    
                    for (int k = j + 1; k < board[0].length - j; k++){
                        if (board[i][k] == cur) return false;
                    }
                    for (int k = i + 1; k < board[0].length - i; k++){
                        if (board[k][j] == cur) return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean reccheck(char[][] board,int i,int j){
        char temp = board[i][j];
        int temp1 = i;
        int temp2 = j;
        int r = i + 3;
        int c = j+3;
        if(r % 3 != 0){
            while(r % 3 != 0){
                r--;
                i--;
            }
        }
        if(c % 3 != 0){
            while(c % 3 != 0){
                c--;
                j--;
            }
        }
        for(int k = i; k < i + 3; k++){
            for(int l = j; l < j + 3; l++){
                if(board[k][l] == temp && k != temp1 && l != temp2){
                    System.out.println(k + "," + l + "reccheck");
                    return false;
                }
            }
        }
        return true;
    }
}
