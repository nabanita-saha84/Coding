class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            set.add(i);
        }

        int max = 1;
        for(int i : set){
            if(!set.contains(i-1)){
                int prev = i;
                int curr = 1;
                while(set.contains(prev+1)){
                    prev = prev+1;
                    curr = curr+1;
                }
                max = Math.max(max, curr);
            }
        }
        return max;
    }
}