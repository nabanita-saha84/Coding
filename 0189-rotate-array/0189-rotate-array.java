class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        if(k==0 || len==1 || len==k){
            return;
        }
    
        reverse(nums, 0, len-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums, k, len-1);
        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums, int start, int end){
        int mid = (end-start)/2;
        for(int i=0; i<=mid; i++){
            int t = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = t;
            }
    }
}