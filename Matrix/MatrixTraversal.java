package Matrix;

import java.util.Scanner;

public class MatrixTraversal {
    public static void main(String[] args) throws java.lang.Exception {
        // input
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int Matrix[][]=new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Matrix[i][j]=sc.nextInt();
            }
        }

        int top=0;
        int bottom=n-1;
        int right=m-1;
        int left=0;

        while (bottom >= top && right >=left) {

            //left to right [top++]
            for(int i=left; i<=right; i++){
                System.out.print(Matrix[top][i]+" ");
            }
            top++;
            //Top to bottom  [right--]
            for(int i=top; i<=bottom; i++){
                System.out.print(Matrix[i][right]+" ");
            }
            right--;
            //Right to left  [bottom--]
            if (top <= bottom) { // Check to avoid duplicate printing
                for (int i = right; i >= left; i--) {
                    System.out.print(Matrix[bottom][i] + " ");
                }
                bottom--;
            }
            //Bottom to top  [left++]
            if (left <= right) { // Check to avoid duplicate printing
                for (int i = bottom; i >= top; i--) {
                    System.out.print(Matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
