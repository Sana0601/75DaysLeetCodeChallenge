class Solution {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        String word;
    }
    TrieNode root=new TrieNode();
    private void insert(String word)
    {
        TrieNode node=root;
        for(char ch:word.toCharArray())
        {
            int idx=ch-'a';
            if(node.children[idx]==null)
            {
                node.children[idx]=new TrieNode();
            }
            node=node.children[idx];
        }
        node.word=word;
    }
    public List<String> findWords(char[][] board, String[] words) {
        for(String word:words)
        {
            insert(word);
        }
        List<String>ans=new ArrayList<>();
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                dfs(board,i,j,root,ans);
            }
        }
        return ans;
    }
    private void dfs(char[][] board,int i,int j,TrieNode node,List<String>ans)
    {
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]=='#')
        {
            return;
        }
        char ch=board[i][j];
        TrieNode next=node.children[ch-'a'];
        if(next==null)
        {
            return;
        }
        if(next.word!=null)
        {
            ans.add(next.word);
            next.word=null;
        }
        board[i][j]='#';
        dfs(board,i+1,j,next,ans);
        dfs(board,i-1,j,next,ans);
        dfs(board,i,j+1,next,ans);
        dfs(board,i,j-1,next,ans);
        board[i][j]=ch;
    }
}