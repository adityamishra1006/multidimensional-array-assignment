import java.util.Scanner;

public class matrixQuestionOne{

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        // System.out.println("Enter the matrix : ");

        for(int i = 0; i<m; i++){
            for(int j = 0; j< n; j++){
                arr[i][j] = 10;
            }
        }
        System.out.println("The input matrix is : ");
        print(arr);

    }
}