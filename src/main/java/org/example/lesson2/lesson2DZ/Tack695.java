package org.example.lesson2.lesson2DZ;
//Вам дана сетка из двоичных матриц m x n. Остров - это группа из 1 (представляющих сушу),
// соединенных в 4 направлениях (горизонтальных или вертикальных). Вы можете предположить,
// что все четыре края сетки окружены водой.
//
//Площадь острова - это количество ячеек со значением 1 на острове.
//
//Возвращает максимальную площадь острова в сетке. Если острова нет, верните 0.

//Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]
//        Output: 6
//        Explanation: The answer is not 11, because the island must be connected 4-directionally.
//        Example 2:
//
//        Input: grid = [[0,0,0,0,0,0,0,0]]
//        Output: 0
public class Tack695 {
    int[][] grid;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        if (grid.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                ans = Math.max(ans, area(r, c));
            }
        }
        return ans;
    }

    public int area(int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        grid[r][c] = 0;
        return 1 + area(r + 1, c) + area(r - 1, c) + area(r, c + 1) + area(r, c - 1);
    }
}

