1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> result = new ArrayList<>();
4
5        int startRow = 0;
6        int endRow = matrix.length - 1;
7        int startCol = 0;
8        int endCol = matrix[0].length - 1;
9
10        while (startRow <= endRow && startCol <= endCol) {
11            for (int j = startCol; j <= endCol; j++) {
12                result.add(matrix[startRow][j]);
13            }
14
15            for (int i = startRow + 1; i <= endRow; i++) {
16                result.add(matrix[i][endCol]);
17            }
18
19            for (int j = endCol - 1; j >= startCol; j--) {
20                if (startRow == endRow) break;
21                result.add(matrix[endRow][j]);
22            }
23
24            for (int i = endRow - 1; i >= startRow + 1; i--) {
25                if (startCol == endCol) break;
26                result.add(matrix[i][startCol]);
27            }
28
29            startRow++;
30            endRow--;
31            startCol++;
32            endCol--;
33        }
34
35        return result;
36    }
37}