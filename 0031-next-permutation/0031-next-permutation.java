class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-1;

        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }

        if(i==0){
            reverse(nums, 0, n);
            return;
        }

        reverse(nums, i, n);
        for(int j = i; j<n; j++){
            if(nums[j]>nums[i-1]){
                swap(nums, j, i-1);
                break;
            }
        }
    }

    public void reverse(int[] a, int l, int r){
        int n = (r-l)/2;
        for(int i=0; i<n; i++){
            swap(a, i+l, r-1-i);
        }
    }

    public void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}