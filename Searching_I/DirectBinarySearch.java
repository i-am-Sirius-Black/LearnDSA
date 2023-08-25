package Searching_I;

import java.util.Scanner;

public class DirectBinarySearch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr = new int[n];
        int l=-1;
        // input array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            System.out.println();
            System.out.print(searchElement(x,l,n,arr));
        }

    }

    public static int searchElement(int x,int l, int r,int[] arr){
        while(l+1<r){
            int mid=(l+r)/2;
            if(predicate(arr,mid,x)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return l;
    }

    public static int predicate(int[] arr,int mid,int x){
        if(arr[mid]<=x){
            return 0;
        }else
        {
            return 1;
        }
    }
}
