class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int k=0;k<nums.length-1;k++)
        {
           
                if(nums[k]==nums[k+1])
                return true;
           
        }
        return false;
    }
}