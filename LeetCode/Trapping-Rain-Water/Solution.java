1import java.util.*;
2class Solution {
3    public int trap(int[] height) {
4        // left max array
5        int leftMax[] = new int[height.length];
6        leftMax[0] = height[0];
7
8        for(int i=1; i<height.length; i++){
9            leftMax[i] = Math.max(leftMax[i-1],height[i]);
10        }
11        //right max array
12        int rightMax[] = new int[height.length];
13        rightMax[height.length-1] = height[height.length-1];
14        for(int i=height.length-2; i>=0; i--){
15            rightMax[i] = Math.max(height[i],rightMax[i+1]);
16        }
17        int trapwater = 0;
18        for(int i=0; i<height.length; i++){
19        int waterLevel = Math.min(leftMax[i],rightMax[i]);
20        trapwater += waterLevel - height[i];
21        }
22        return trapwater;
23    }
24}