class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int[] arr = new int[nums.length];
        int k=0;
        for(int i: nums){
            if(i!=0){
                arr[k++]=i;
            }
        }
        // for(; k<nums.length; k++){
        //     arr[k]=0;
        // }
        return arr;
    }
}