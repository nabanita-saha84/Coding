class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int top_ind=0, right_ind=n-1, bottom_ind=n-1, left_ind=0;
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                int temp = matrix[top_ind+i][j];
                matrix[top_ind+i][j] = matrix[n-1-j][left_ind+i];
                matrix[n-1-j][left_ind+i] = matrix[bottom_ind-i][n-1-j];
                matrix[bottom_ind-i][n-1-j] = matrix[j][right_ind-i];
                matrix[j][right_ind-i] = temp;
            }
        }
    }
}