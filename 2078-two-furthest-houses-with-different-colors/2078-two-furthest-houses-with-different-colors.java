class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0;
        while(colors[i]==colors[n-1])
        {
            i++;
        }
        int j=n-1;
        while(colors[j]==colors[0])
        {
            j--;
        }
        return Math.max(n-1-i,j);
    }
}