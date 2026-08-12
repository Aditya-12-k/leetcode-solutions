1class Solution {
2    public void moveZeroes(int[] nums) {
3        int slow = 0;
4        for(int fast=0; fast<nums.length; fast++){
5            if(nums[fast]!=0){
6                int temp = nums[slow];
7                nums[slow] = nums[fast];
8                nums[fast] = temp;
9                slow++;
10            }
11        }
12    }
13}