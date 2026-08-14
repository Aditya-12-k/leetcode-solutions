1class Solution {
2    public int addDigits(int num) {
3        int n = num ;
4        while(n>=10){
5            int sum = 0;
6            while(n>0){
7            int lastDigit = n%10;
8            sum += lastDigit;
9            n = n/10;
10        }
11        n = sum;
12
13}
14        return n;
15
16}
17}