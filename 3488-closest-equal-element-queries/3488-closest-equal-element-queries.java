class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        List<Integer>result=new ArrayList<>();
        for(int q:queries)
        {
            List<Integer>list=map.get(nums[q]);
            if(list.size() == 1)
            {
                result.add(-1);
                continue;
            }
            int pos=Collections.binarySearch(list,q);
            int minDist=Integer.MAX_VALUE;
            if(pos>0)
            {
                int diff=q-list.get(pos-1);
                minDist=Math.min(minDist,Math.min(diff,n-diff));
            
            }
            else
            {
                int diff=Math.abs(q-list.get(list.size()-1));
                minDist=Math.min(minDist,Math.min(diff,n-diff));
            }
            if(pos<list.size()-1)
            {
                int diff=list.get(pos+1)-q;
                minDist=Math.min(minDist,Math.min(diff,n-diff));
            }
            else
            {
                int diff=Math.abs(q-list.get(0));
                minDist=Math.min(minDist,Math.min(diff,n-diff));
            }
            result.add(minDist);
        }
        return result;
    }
}