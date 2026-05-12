class Solution {
    public int myAtoi(String s) {
        int n=s.length();
        int sign=1;
        int num=0;
        boolean started=false;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ' && !started)
            {
               continue;
            }
            if((ch=='+' || ch=='-') && !started)
            {
                started=true;
                if(ch=='-')
                {
                    sign=-1;
                }
                continue;
            }
            if(Character.isDigit(ch))
            {
                started=true;
                int digit=ch-'0';
                if(num>Integer.MAX_VALUE/10 || (num== Integer.MAX_VALUE/10 && digit>7))
                {
                    if(sign==1)
                    {
                        return Integer.MAX_VALUE;
                    }
                    else
                    {
                        return Integer.MIN_VALUE;
                    }
                }
                num=num*10+digit;
            }
            else
            {
                break;
            }
        }
        return num*sign;
    }
}