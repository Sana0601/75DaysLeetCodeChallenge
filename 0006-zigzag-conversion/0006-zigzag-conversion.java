class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        StringBuilder[] rail=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rail[i]=new StringBuilder();
        }
        int row=0;
        boolean down=true;
        for(char ch:s.toCharArray())
        {
            rail[row].append(ch);
            if(row==0)
            {
                down=true;
            }
            else if(row==numRows-1)
            {
                down=false;
            }
            if(down)
            {
                row++;
            }
            else
            {
                row--;
            }
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            result.append(rail[i]);
        }
        return result.toString();
    }
}