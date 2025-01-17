class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int k=0;
        for(int i=0; i<len; i++){
            int ele = nums[i];
            while(i+1<len && nums[i+1]==ele)
                i++;
            nums[k++] = ele;    
        }
        return k;
    }
}