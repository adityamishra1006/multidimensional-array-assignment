public class matrixQuestionNine{

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

        for(int i =0; i<m ;i++){
            for(int j =0; j<i; j++){
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }
        print(matrix1);

        for(int j =0 ; j< n ;j++){
            int a=0, b = n-1;
            while (a<b) {
                int temp = matrix1[a][j];
                matrix1[a][j] = matrix1[b][j];
                matrix1[b][j] = temp;
                a++;
                b--;
            }
        }
        print(matrix1);
        
    }
}