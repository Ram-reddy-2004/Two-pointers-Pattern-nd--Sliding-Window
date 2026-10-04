class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxarea=0;
        while(l<r){
            int width = r-l;
            int minHeight = Math.min(height[l],height[r]);
            maxarea = Math.max(maxarea,width * minHeight);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxarea;
    }
}