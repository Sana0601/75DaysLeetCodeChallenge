class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            xor^=nums[i];
            xor^=i;
        }
        return xor;
    }
}