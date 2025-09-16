class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        
        int k = set.size();
        int j=0;
        for(Integer i : set){
            nums[j++]=i;
        }
        return k;
    }
}