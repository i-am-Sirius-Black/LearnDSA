package Searching_I;

import java.util.Scanner;

public class SortedBinaryArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int arr[] = new int[n];
        int L=-1,R=n;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        while(L+1<R){
            int mid=(L+R)/2;

            if(arr[mid]==0)
            {
                L=mid;
            }
            else {
                R=mid;
            }
        }
        System.out.print(R+" "+L);
    }
}
