package Searching_I;

import java.util.Scanner;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr = new int[n];
        int l=-1; int r=n;

        // input array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //traversing queries
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            System.out.println();
            int first=searchFirstIndex(l,r,arr,x);
            int last=searchLastIndex(l,r,arr,x);

            if( first==n || arr[first]!=x){
               first=-1;
               last=-1;
            }
            System.out.println(first+" "+last);
        }

    }

    //method 1..................................................................
    public static int searchFirstIndex(int l, int r, int[] arr, int x){
        while(l+1<r){
            int mid=(l+r)/2;
            if(predicateFirstIndex(arr,mid,x)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return r;
    }

    public static int predicateFirstIndex(int[] arr,int mid,int x){
        return (arr[mid] < x) ? 0 : 1;     //if else condition to return 0 if true and 1 for false
    }

    //method 2......................................................................
    public static int searchLastIndex(int l, int r, int[] arr, int x){
        while(l+1<r){
            int mid=(l+r)/2;
            if(predicateLastIndex(arr,mid,x)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return l;
    }

    public static int predicateLastIndex(int[] arr,int mid, int x) {
        return (arr[mid] <= x) ? 0 : 1;        //if else condition to return 0 if true and 1 for false
    }

}
