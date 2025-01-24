class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i: nums){
            if(i>0) pos.add(i);
            else    neg.add(i);
        }

        int n1 = pos.size();
        int n2 = neg.size();

        int i=0;
        int k=0;
        while(i<n1 && i<n2){
            nums[k++] = pos.get(i);
            nums[k++] = neg.get(i);
            i++;
        }

        while(i<n1){
            nums[k++] = pos.get(i);
            i++;
        }
        while(i<n2){
            nums[k++] = neg.get(i++);
        }

        return nums;
    }
}