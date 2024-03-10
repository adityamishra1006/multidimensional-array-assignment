public class matrix_5 {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,3,5,7},
            {3,4,7,8},
            {1,4,12,3}
        };

        int maxSum = 0;
        int maxRow= -1;

        for(int i =0; i<matrix.length; i++){
            int rowSum = 0;
            for(int j = 0; j<matrix[i].length; j++){
                rowSum = matrix[i][j];
            }
            if(rowSum > maxSum){
                maxSum = rowSum;
                maxRow = i+1;
            }
        }
        System.err.println("Row with maximum sum : " + maxRow);
    }
}
