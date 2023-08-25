package Matrix;

import java.util.Scanner;

public class MatrixRotate90 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        // int TransposedMatrix[][]=new int[n][m];
        int Matrix[][]=new int[n][n];
        int RMatrix[][]=new int[n][n];
        //input
        //make transpose then rotate columns of (transposed) matrix
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                // TransposedMatrix[j][i]=sc.nextInt(); //we are taking input as transposed version
                Matrix[i][j]=sc.nextInt();
            }
        }

        int x=-1;
        for(int j=n-1; j>=0; j--){
            x++;
            for(int i=0; i<n; i++){
                RMatrix[x][i]=Matrix[i][j];
            }
        }

        for(int i=0; i<n; i++){
            System.out.println();
            for(int j=0; j<n; j++){
                System.out.print(RMatrix[i][j]+" ");
            }
        }
    }
}
