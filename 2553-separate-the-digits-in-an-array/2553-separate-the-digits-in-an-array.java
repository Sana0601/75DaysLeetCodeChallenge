class Solution {
    public int[] separateDigits(int[] nums) {
       String s="";
       for(int x:nums)
       {
        s+=x;
       }
      String[]  s1=s.split("");
        int[] ans=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            ans[i]=Integer.parseInt(s1[i]);
        }
        return ans;
    }
}