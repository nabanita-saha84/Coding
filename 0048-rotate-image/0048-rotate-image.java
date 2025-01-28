class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] resultant = new int[n][n];
        int i=n-1;
        for(int[] row : matrix){
            for(int j=0; j<n; j++){
                resultant[j][i] = row[j];
            }
            i--;            
            System.out.println(Arrays.deepToString(resultant));
        }       
        i=0;
        for(int[] row : resultant){
            matrix[i++] = row;
        }
    }
}