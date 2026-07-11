class Solution {

    private int[] x;
    private boolean[] rowOccupied;
    private boolean[] diag1;
    private boolean[] diag2;

    private void placeQueen(int i, int n, List<List<String>> result)
    {
        // If column out-of-bound, we've placed all n queens successfully
        if (i == n)
        {
            result.add(makeGrid(x));
            return;
        }

        for (int j = 0; j < n; j++)
        {
            // If the row, diagonal, and anti-diagonal are free, place the queen
            if (rowOccupied[j] && diag1[i+j] && diag2[j-i + n-1])
            {
                // Record the column of the queen in row j
                x[j] = i;
                rowOccupied[j] = diag1[i+j] = diag2[j-i + n-1] = false;

                placeQueen(i+1, n, result);

                // Backtrack: undo the marks
                rowOccupied[j] = diag1[i+j] = diag2[j-i + n-1] = true;
            }
        }
    }

    private List<String> makeGrid(int[] x)
    {
        List<String> grid = new ArrayList<>();

        for (int row = 0; row < x.length; row++)
        {
            char[] line = new char[x.length];
            Arrays.fill(line, '.');
            line[x[row]] = 'Q';
            grid.add(new String(line));
        }
        return grid;
    }

    public List<List<String>> solveNQueens(int n) {
        // x[row] = column of the queen placed in that row
        x = new int[n];
        rowOccupied = new boolean[n];
        diag1 = new boolean[2*n - 1];
        diag2 = new boolean[2*n - 1];

        Arrays.fill(rowOccupied, true);
        Arrays.fill(diag1, true);
        Arrays.fill(diag2, true);

        List<List<String>> result = new ArrayList<>();
        placeQueen(0, n, result);
        return result;
    }
}