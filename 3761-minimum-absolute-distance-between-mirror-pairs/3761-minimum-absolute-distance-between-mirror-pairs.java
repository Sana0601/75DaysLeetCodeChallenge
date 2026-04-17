class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int result = Integer.MAX_VALUE;

        for(int i =0; i < nums.length; i++){
            int current = nums[i];

            if(indexMap.containsKey(current)) {
                int prevIndex = indexMap.get(current);
               result = Math.min(result, i - prevIndex);
            }
        int reversed = getReversed(current);
        indexMap.put(reversed, i);
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
    private int getReversed(int num){
        int reversed = 0;
        while(num != 0){
            reversed = reversed * 10 + num % 10;
            num /= 10;
            }
            return reversed;
}
}
            