class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=0, j=1;
        while(i<nums.length && nums[i]!=1) i++;
        j=i+1;
        while(i<j && j<nums.length){
            if(nums[j]==1){
                if((j-i-1)<k){
                    return false;
                }
                i=j;
            }
            j++;
        }
        return true;
    }
}