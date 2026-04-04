class Solution {
    public int searchInsert(int[] nums, int target) {
        //if(target<nums[0])
       // return 0;
        for(int j=0;j<nums.length;j++)
        {
            if(target<=nums[j])
            return j;

        }
        return nums.length;
    }
}