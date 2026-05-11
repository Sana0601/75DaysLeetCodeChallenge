class Solution {
    public String longestPalindrome(String s) {
     //   StringBuilder sb=new StringBuilder();
    /* String ans="";
       for(int i=0;i<s.length();i++)
       {
        for(int j=i;j<s.length();j++)
        {
            String ch=s.substring(i,j+1);
           String s1=new StringBuilder(ch).reverse().toString();
            if(ch.equals(s1))
            {
                if(ans.length()<ch.length())
                {
                    ans=ch;
                }
            }
        }
       }
       return ans;*/
       String ans="";
       for(int i=0;i<s.length();i++)
       {
        for(int j=i;j<s.length();j++)
        {
            if(isPalindrome(s,i,j))
            {
                if(ans.length()<j-i+1)
                {
                    ans=s.substring(i,j+1);
                }
            }
        }
       }
       return ans;
    }
    public boolean isPalindrome(String s,int l,int r)
    {
        while(l<r)
        {
        if(s.charAt(l)!=s.charAt(r))
        {
            return false;
        }
        l++;
        r--;
        }
        return true;
    }
}