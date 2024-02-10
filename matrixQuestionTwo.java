public class matrixQuestionTwo {

    public static void print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i<m; i++){
            for(int j = 0; j< n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{4,5,8}, {0,0,8},{1,2,0}}; 

        int m = matrix1.length;
        int n = matrix1[0].length;
        int[][] result = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[i][j] = matrix1[i][j] + matrix2[i][j];
    
            }        
        }
        print(result);
    }
}
