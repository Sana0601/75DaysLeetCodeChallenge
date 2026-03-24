class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            int max= width*h;
            area=Math.max(area,max);
            if(height[left]<height[right])
            left++;
            else
            right--;
        }

        return area;
    }
}