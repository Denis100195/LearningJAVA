package InterviewQuestions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidSudokuTest {
    char[][] board =
            {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};

    @Test
    public void isValidSudoku() {
        ValidSudoku validSudoku = new ValidSudoku();
        Assert.assertTrue(validSudoku.isValidSudoku(board));
    }
}