package QueueStack;

/*Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:
 Input: grid = [
 ["1","1","1","1","0"],
 ["1","1","0","1","0"],
 ["1","1","0","0","0"],
 ["0","0","0","0","0"]
 ]
 Output: 1

 Example 2:
 Input: grid = [
 ["1","1","0","0","0"],
 ["1","1","0","0","0"],
 ["0","0","1","0","0"],
 ["0","0","0","1","1"]
 ]
 Output: 3*/

public class NumberOfIslands {
    public int numIslandsBFS(char[][] grid) {
        int count = 0;

        if (grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++){
                if (grid[i][j] == '1'){
                    count++;
                    markNeighbour(grid, i, j);
                }
            }
        }
        return count;

    }
    //BFS method
    public void markNeighbour(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        markNeighbour(grid, i + 1, j);
        markNeighbour(grid, i - 1, j);
        markNeighbour(grid, i, j + 1);
        markNeighbour(grid, i, j - 1);
    }

    //DFS method
    public void dfsMark(char[][] grid, int row, int col){
        //check necessary conditions
        if (row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1){
            return;
        }
        if (grid[row][col] == '0'){
            return;
        }
        //process cell
        grid[row][col] = '0';

        //call dfs as needed
        dfsMark(grid, row, col + 1);
        dfsMark(grid, row, col - 1);
        dfsMark(grid, row + 1, col);
        dfsMark(grid, row - 1, col);



    }



}

