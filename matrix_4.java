public class matrix_4 {
    public static int returnMax(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int mx = Integer.MIN_VALUE;
        for(int i =0; i<m ;i++){
            for(int j = 0; j<n; j++){
                mx = Math.max(mx,matrix[i][j]);
            }
        }
        return mx;
    }
    public static void main(String[] args) {

        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 30, 8},
            {9, 20, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println();
        System.out.println("Maximum in the given matrix : " + returnMax(matrix1));
        System.out.println();
    }
}
