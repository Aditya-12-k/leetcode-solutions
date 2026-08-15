1class Solution {
2    public int diagonalSum(int[][] mat) {
3        int sum = 0;
4        for(int i=0; i<mat.length; i++){
5            for(int j=0; j<mat[0].length; j++){
6                if(i==j){
7                    sum += mat[i][j];
8                }
9                else if((i+j) == mat.length-1){
10                    sum += mat[i][j];
11                }
12            }
13        }
14       return sum; 
15    }
16}