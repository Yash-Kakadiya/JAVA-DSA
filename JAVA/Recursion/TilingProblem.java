/*Tiling Problem
    Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the 2 x 1 tiles.
    (A tile can either be placed horizontally or vertically.)
 */

public class TilingProblem {
    public static int tilingProblem(int n) { // 2 x n (floor size), 2 x 1 (tile size)

        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalTiles = tilingProblem(n - 1);
        int horizontalTiles = tilingProblem(n - 2);

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;

        // return tilingProblem(n - 1) + tilingProblem(n - 2); // Short
    }

    public static void main(String[] args) {

        System.out.println(tilingProblem(3));

    }
}
