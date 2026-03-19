class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            sb.append(Character.toLowerCase(ch));
        }
      String rev=  sb.toString();
      String str =sb.reverse().toString();
      return rev.equals(str);
    }
}