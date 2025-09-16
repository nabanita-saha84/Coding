class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i : nums)
            set.add(i);
        for(int i : set)
            System.out.println(i);
        int k = set.size();
        int j=0;
        for(Integer i : set){
            nums[j++]=i;
        }
        return k;
    }
}