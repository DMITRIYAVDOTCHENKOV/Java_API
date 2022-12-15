package org.example.lesson2.lesson2DZ;
//Изображение представлено целочисленным изображением сетки m x n, где изображение [i] [j] представляет
// значение пикселя изображения.
//
//        Вам также даны три целых числа sr, sc и color. Вы должны выполнить заливку изображения,
//        начиная с пиксельного изображения[sr][sc].
//
//        Чтобы выполнить заливку потоком, рассмотрим начальный пиксель, плюс любые пиксели,
//        соединенные в 4 направлениях с начальным пикселем того же цвета, что и начальный пиксель,
//        плюс любые пиксели, соединенные в 4 направлениях с этими пикселями (также с тем же цветом),
//        и так далее. Замените цвет всех вышеупомянутых пикселей на color.
//
//        Верните измененное изображение после выполнения заливки потоком.

//Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//        Output: [[2,2,2],[2,2,0],[2,0,1]]
//        Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
//        Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
//        Example 2:
//
//        Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
//        Output: [[0,0,0],[0,0,0]]
//        Explanation: The starting pixel is already colored 0, so no changes are made to the image.
//
//
//        Constraints:
//
//        m == image.length
//        n == image[i].length
//        1 <= m, n <= 50
//        0 <= image[i][j], color < 216
//        0 <= sr < m
//0 <= sc < n
public class Tack733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] != color) {
            dfs(image, sr, sc, image[sr][sc], color);
        }
        return image;
    }

    private void dfs(int[][] image, int i, int j, int c0, int c1) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != c0){
            return;
        }
        image[i][j] = c1;
        dfs(image, i, j - 1, c0, c1);
        dfs(image, i, j + 1, c0, c1);
        dfs(image, i - 1, j, c0, c1);
        dfs(image, i + 1, j, c0, c1);
    }
}
