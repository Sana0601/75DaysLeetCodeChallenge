class Solution {
    int[] parent;
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
        int n=source.length;
        parent =new int[n];
        for(int i=0;i<n;i++)
        parent[i]=i;
        for(int[] swap:allowedSwaps)
        {
            union(swap[0],swap[1]);
        }
        Map<Integer,Map<Integer,Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int p=find(i);
            map.putIfAbsent(p,new HashMap<>());
            Map<Integer,Integer>freq=map.get(p);
            freq.put(source[i],freq.getOrDefault(source[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int p=find(i);
            Map<Integer,Integer>freq=map.get(p);
            if(freq.getOrDefault(target[i],0)>0)
            {
                freq.put(target[i],freq.get(target[i])-1);
            }
            else
            {
                ans++;
            }
        }
        return ans;
    }
    int find(int x)
    {
        if(parent[x]!=x)
        {
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }
    void union(int a,int b)
    {
        parent[find(a)]=find(b);
    }
}