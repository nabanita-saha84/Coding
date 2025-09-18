class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k==0 || nums.length==0 || nums.length==1){
            return;
        }
        int[] temp = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = nums[nums.length-1-i];
        }
        for(int i=nums.length-k-1; i>=0; i--){
            nums[i+k] = nums[i];
        }
        for(int i=0; i<k; i++){
            nums[i] = temp[k-1-i];
        }
    }
}