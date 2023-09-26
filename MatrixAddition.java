import java.util.*;
public class MatrixAddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :");
        int row = sc.nextInt();
         System.out.println("Enter the size of col :");
        int col = sc.nextInt();

        int A[][] = new int[row][col];
        int B[][] = new int[row][col];
        int C[][] = new int[row][col];
        System.out.println("Enter the First 3X4 matrix element :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Second 3X4 Matrix element :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                B[i][j] = sc.nextInt();
            }
        }

         System.out.println("The first Matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Second 3X4 Matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The Addition of Matrix is :");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                C[i][j] = A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }


    }
}
