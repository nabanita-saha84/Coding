class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int top_ind=0, right_ind=n-1, bottom_ind=n-1, left_ind=0;
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                int top = matrix[top_ind+i][j];
                int right = matrix[j][right_ind-i];
                int bottom = matrix[bottom_ind-i][n-1-j];
                int left = matrix[n-1-j][left_ind+i];
                matrix[top_ind+i][j] = left;
                matrix[j][right_ind-i] = top;
                matrix[bottom_ind-i][n-1-j] = right;
                matrix[n-1-j][left_ind+i] = bottom;
                System.out.println("Top : "+top+" Right : "+right+" Bottom : "+bottom+" Left  : "+left);
                System.out.println(Arrays.deepToString(matrix));
            }
        }

    }
}