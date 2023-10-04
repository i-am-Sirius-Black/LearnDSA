package BinaryAdvance;

import java.util.Scanner;

public class RotatedSearch {
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);

        int n= sc.nextInt();
        int[] ar= new int[n];

        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        int l=-1, r=n-1;

        while(l+1<r){
            int mid = l+(r-l)/2;

            if(predicate(mid, ar, n-1) == 0){
                r=mid;
            }else{
                l=mid;
            }
        }
        System.out.print(ar[r]);
    }

    public static int predicate(int mid, int[] ar, int last){

        if(ar[mid] <= ar[last]){
            return 0;
        }else return 1;
    }
}

