class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftsum=new int[n];
        int[] rightsum=new int[n];
        leftsum[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftsum[i]=Math.max(leftsum[i-1],height[i]);
        }
        rightsum[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightsum[i]=Math.max(rightsum[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<n;i++)
        {
            water+=Math.min(leftsum[i],rightsum[i])-height[i];
        }
        return water;
    }
}