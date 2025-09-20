class Solution{
    public static ArrayList<Integer> findUnion(int nums1[], int nums2[]) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums1)      set.add(i);
        for(int i : nums2)      set.add(i);

        ArrayList<Integer> result = new ArrayList<>(set);

        Collections.sort(result);

        return result;
    }
}
