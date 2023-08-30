package Searching_I;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int len=n*m;
        int l=-1;


        int[] NotMatrix= new int[len];  // here, instead of taking inputs in matrix[][], we are storing it in an 1d array, because question says (matrix is sorted) and last element of 1 row is smaller than 1st element of 2nd row , means in incresing order.

        for(int i=0; i<len; i++){
            NotMatrix[i]=sc.nextInt();
        }

        for(int i=0; i<q; i++){
            int key=sc.nextInt();
            int ans =searchQ(NotMatrix, key, l, len);
            System.out.println(ans/m +" "+ ans%m);
        }
    }

    public static int searchQ(int[] NotMatrix, int key, int l, int r){
        int mid;
        while(l+1<r){          //while q-- is greater than 0

            mid=(l+r)/2;

            if(predicate(NotMatrix, mid, key)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return l;
    }

    public static int predicate(int[] NotMatrix, int mid, int key){
        if(NotMatrix[mid]<=key){
            return 0;
        }
        return 1;
    }
}
