public class matrixQuestionEight {

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

        int m = matrix1.length;
        int n = matrix1[0].length;
        print(matrix1);

        

        System.out.println();

        for (int i = 0; i < m; i++) {
            for(int j =0; j<n; j++){
                if(i==j || i+j == m-1 ){
                    matrix1[i][j] = matrix1[i][j];
                }else{
                    matrix1[i][j]=0;
                }
            }
        }
        print(matrix1);

        
        for (int i = 0; i < m; i++) {
            for(int j =0; j<n; j++){
               if (matrix1[i][j]==0) {
                    System.out.print(" "+" ");
               }else{
                System.out.print(matrix1[i][j]+" ");
               }
            }
            System.out.println();
        }
        
    }
}
