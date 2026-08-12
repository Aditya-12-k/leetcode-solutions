1import java.util.*;
2class Solution {
3    public int maxSubArray(int[] nums) {
4        int currSum = 0;
5        int maxSum = Integer.MIN_VALUE;
6        for(int i=0; i<nums.length; i++){
7            if(currSum<0){
8                currSum = 0;
9            }
10            currSum = nums[i] + currSum;
11
12            maxSum = Math.max(currSum,maxSum);
13        }
14        return maxSum;
15    }
16}