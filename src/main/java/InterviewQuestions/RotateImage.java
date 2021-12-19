package InterviewQuestions;
/*
* You are given an n x n 2D matrix representing an image, rotate the
* image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify
* the input 2D matrix directly. DO NOT allocate
*  another 2D matrix and do the rotation.
*
* Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

* Output: [[7,4,1],[8,5,2],[9,6,3]]
* */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n/2 ; j++){
                int tmp = matrix[i][j];
                matrix[i][j]= matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }
        for(int i =0 ; i<n ;i++){
            for(int j=0 ; j<n-i-1 ; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = tmp;
            }
        }
    }
}
