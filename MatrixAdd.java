import java.util.*;
public class MatrixAdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A[][] = new int[3][4];
        int B[][] = new int[3][4];
        int C[][] = new int[3][4];
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
