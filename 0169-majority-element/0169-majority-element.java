class Solution {
    public int majorityElement(int[] nums) {
        int ele=-1, counter=0;
        for(int i: nums){
            if(counter==0){
                ele=i;
                counter++;
            } else if(i!=ele){
                counter--;
            } else{
                counter++;
            }
        }
        return ele;
    }
}