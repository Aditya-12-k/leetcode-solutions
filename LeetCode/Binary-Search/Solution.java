1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int last = nums.length-1;
5        for(int i=0; i<nums.length; i++){
6            int mid = (low+last)/2;
7            if(nums[mid]==target){
8                return mid;
9            }else if(nums[mid]<target){
10                low = mid+1;
11            }else{
12                last = mid-1;
13            }
14        }
15        return -1;
16    }
17}