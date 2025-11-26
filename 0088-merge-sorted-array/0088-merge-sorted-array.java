class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=n-1, i=m-1;
        while(j>=0 && i>=0)
       {
           if(nums1[i]>=nums2[j])
               nums1[i+j+1]=nums1[i--];
           else
               nums1[i+j+1]=nums2[j--];
       }            
        while(j>=0)
        {
            nums1[j]=nums2[j];
            j--;
        }
    }
}