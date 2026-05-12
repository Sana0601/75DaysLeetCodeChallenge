class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
      /*  for(int i=0;i<digits.length;i++)
        {
            sum=sum*10+digits[i];
        }
        sum=sum+1;
        String ans=String.valueOf(sum);
      /*  for(int x:sum)
        {
            ans+=x;
        }
        int n=ans.length();
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            char ch=ans.charAt(i);
            result[i]=ch-'0';*/
            for(int i=digits.length-1;i>=0;i--)
            {
                if(digits[i]<9)
                {
                    digits[i]++;
                    return digits;
                }
                else
                {
                    digits[i]=0;
                }
            }
            int[] result=new int[digits.length+1];
            result[0]=1;
        
        return result;
    }
}