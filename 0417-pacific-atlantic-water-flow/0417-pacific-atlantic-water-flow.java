class Solution {
    int m,n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res=new ArrayList<>();
        m=heights.length;
        n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            dfs(heights,pacific,i,0);
            dfs(heights,atlantic,i,n-1);
        }
        for(int j=0;j<n;j++)
        {
            dfs(heights,pacific,0,j);
            dfs(heights,atlantic,m-1,j);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                {
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    private void dfs(int[][] heights,boolean[][] visited,int r,int c)
    {
        visited[r][c]=true;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        for(int k=0;k<4;k++)
        {
            int nr=r+dr[k];
            int nc=c+dc[k];
            if(nr<0 || nr>=m || nc<0 || nc>=n)
            continue;
            if(visited[nr][nc])
            continue;
            if(heights[nr][nc]<heights[r][c])
            continue;
            dfs(heights,visited,nr,nc);
        }
    }
}