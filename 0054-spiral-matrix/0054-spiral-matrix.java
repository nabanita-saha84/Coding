class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int i=0, j=0;

        while(i<=n/2){
            j=i;
            while(j<m-i){
                spiral.add(matrix[i][j]);
                j++;
            }
            System.out.println(spiral.toString());
            int k=i+1; j=m-i-1;
            while(k<n-i){
                spiral.add(matrix[k][j]);
                k++;
            }
            System.out.println(spiral.toString());
            k=n-i-1; j=m-i-2;
            if(n-i-1==i){
                break;
            }
            while(j>=i){
                spiral.add(matrix[k][j]);
                j--;
            }
            System.out.println(spiral.toString());
            if(i==m-i-1){
                break;
            }
            k=n-i-2; j=i;
            while(k>i){
                spiral.add(matrix[k][j]);
                k--;
            }
            System.out.println(spiral.toString());
            i++;
        }
        return spiral;
    }
}