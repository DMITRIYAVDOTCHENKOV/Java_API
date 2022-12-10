package org.example.lesson2;
//Учитывая сетку двоичной сетки mxn 2D, которая представляет карту '1' (суша) и '0' (вода), верните количество островов.
//Остров окружен водой и образуется путем соединения соседних земель по горизонтали или вертикали.
// Вы можете предположить, что все четыре края сетки окружены водой.

//Example 1:
//
//        Input: grid = [
//        ["1","1","1","1","0"],
//        ["1","1","0","1","0"],
//        ["1","1","0","0","0"],
//        ["0","0","0","0","0"]
//        ]
//        Output: 1
//        Example 2:
//
//        Input: grid = [
//        ["1","1","0","0","0"],
//        ["1","1","0","0","0"],
//        ["0","0","1","0","0"],
//        ["0","0","0","1","1"]
//        ]
//        Output: 3
//
//
//        Constraints:
//
//        m == grid.length
//        n == grid[i].length
//        1 <= m, n <= 300
//        grid[i][j] is '0' or '1'.
public class Tack200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[j].length; j++) {
                if (grid[i][j] == '1'){
                    dfs(i, j, grid);
                    count++;
                }
            }
        }
        return count;
    }
    private  void dfs(int i, int j, char[][] grid){
        if (i < 0 || i > grid.length || j < 0 || j >= grid.length || grid[i][j] != '1' ){
            return;
        }
        grid[i][j] = '0';
        dfs(i -1, j, grid);
        dfs(i + 1, j, grid);
        dfs(i, j - 1, grid);
        dfs(i, j - 1, grid);
    }
}
