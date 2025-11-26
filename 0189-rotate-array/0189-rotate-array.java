class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        len--;
        rotate(nums,0,len-k);
        rotate(nums, len-k+1, len);
        rotate(nums, 0, len);

    }
    public void rotate(int[] nums, int l, int r){
        while(l<r){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++; r--;
        }
    }
}