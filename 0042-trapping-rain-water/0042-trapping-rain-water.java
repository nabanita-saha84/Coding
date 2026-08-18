class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l=0;
        int l_max=0;
        int r=n-1;
        int r_max=0;
        int total=0;

        while(l<r){
            if(height[l]<=height[r]){
                if(l_max>height[l]){
                    total+=l_max-height[l];
                } else {
                    l_max=height[l];
                }
                l++;
            } else{
                if(r_max>height[r]){
                    total+=r_max-height[r];
                } else{
                    r_max=height[r];
                }
                r--;
            }
        }
        return total;
    }
}