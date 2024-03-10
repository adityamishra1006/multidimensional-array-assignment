import java.util.Scanner;

public class matrix_3{
    public static int returnSum(int[][] matrix, int r1, int c1, int r2,  int c2){

        int totalSum=0;
        for(int i = c1; i<=c2; i++){
            for(int j = r1; j<=r2; j++){
                totalSum = matrix[i][j];
            } 
        }

        return totalSum;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row 1 :");
        int r1 = sc.nextInt();
        System.out.print("Enter Column 1 :");
        int c1 = sc.nextInt();
        System.out.print("Enter Row 2 :");
        int r2 = sc.nextInt();
        System.out.print("Enter Column 2 :");
        int c2 = sc.nextInt();
        
        System.out.print(returnSum(matrix1, r1, c1, r2, c2));

    }
}