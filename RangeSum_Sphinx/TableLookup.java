package RangeSum_Sphinx;

import java.util.Scanner;

public class TableLookup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int target=sc.nextInt();

        int table[][]=new int[n][m];

        for(int i=0;i<n;i++){

            for(int j=0; j<m;j++){
                table[i][j]=sc.nextInt();
            }
        }
        boolean found =false;
        int i=0, j=m-1;
        while(i<n && j>=0){

            if(table[i][j]==target){
                System.out.println("YES");
                found=true;
                break;
            } else if (table[i][j]<target)  //if key is greater than target, then we will decrease key <----
              {
                i++;
              }else {
                j--;  //if above not true then definitely key is smaller
            }
        }
        if(!found){
            System.out.println("NO");
        }
    }
}


