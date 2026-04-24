class Trie {
    class Node{
        Node[] children=new Node[26];
        boolean isEnd=false;
    }
    private Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(char c: word.toCharArray())
        {
            int index=c-'a';
            if(curr.children[index]==null){
                curr.children[index]=new Node();
            }
            curr=curr.children[index];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        Node node=findNode(word);
        return node!=null && node.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        return findNode(prefix)!=null;
    }
    private Node findNode(String str)
    {
        Node curr=root;
        for(char c:str.toCharArray())
        {
            int index=c-'a';
            if(curr.children[index]==null)
            {
                return null;
            }
            curr=curr.children[index];
        }
        return curr;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */