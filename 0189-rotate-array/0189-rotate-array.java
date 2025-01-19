class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k==0 || len==1 || len==k){
            return;
        }
        
        k = k%len;
        int[] t = new int[k];
        System.arraycopy(nums, len-k, t, 0 , k);
        for(int i=len-k-1; i>=0; i--){
            // int index = (i+k)%len;
            nums[i+k] = nums[i];
        }
        System.arraycopy(t,0,nums,0,k);
    }
}