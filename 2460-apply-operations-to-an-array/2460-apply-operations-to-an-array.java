class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }

        for(int i=0, j=nums.length-1; i<=j; i++){
            if(nums[i]==0){
                while(nums[j]==0){
                    j--;
                }
                if(j>i){
                    swap(i, j, nums);
                    j--;
                }
            }
        }
        return nums;
    }

    void swap(int a, int b, int[] arr){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}