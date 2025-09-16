class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;

        int i=0, j=0;
        int n = nums.length;
        for(; j<n; j++){
            if(nums[i]!=nums[j]){
                if(count>=2) {
                    nums[i+1]=nums[i];
                    i++;
                }
                i++;
                nums[i]= nums[j];
                count=1;
            } else if(nums[i]==nums[j]){
                count++;
            }
        }    
        if(count>=2){nums[i+1]=nums[i]; i++;}
        return i+1;
    }
}