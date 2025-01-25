class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int i=n;

        while(i>0 && nums[i]<=nums[i-1]){
            i--;
        }

        if(i==0){
            Arrays.sort(nums);
            return;
        }
        else{
            int t = nums[i-1];
            int nearest=i;
            for(int j=i; j<=n; j++){
                if(nums[j]>t && nums[j]<nums[nearest]){
                    nearest = j;
                }
            }
            nums[i-1] = nums[nearest];
            nums[nearest] = t;
            Arrays.sort(nums, i, n+1);
        }

    }
}