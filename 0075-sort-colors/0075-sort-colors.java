class Solution {
    public void sortColors(int[] nums) {
        int zero=0, one=0, two=0;

        for(int i: nums){
            if(i==0)    zero++;
            else if(i==1)    one++;
            else    two++;
        }

        int i=0;
        for(; i<zero; i++){
            nums[i]=0;
        }
        for(; i<zero+one; i++){
            nums[i]=1;
        }
        for(; i<nums.length; i++){
            nums[i]=2;
        }
    }
}