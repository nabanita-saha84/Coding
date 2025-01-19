class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int expected = len*(len+1)/2;
        int actual = 0;
        for(int i: nums){
            actual+=i;
        }
        return expected-actual;
    }
}