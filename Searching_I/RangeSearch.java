package Searching_I;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int l=-1, r=n;
        for(int i=0;i<q;i++){
            int a=sc.nextInt();
            int x =searchFirstIndex(arr,l,r,a);

            int b=sc.nextInt();
            int y =searchLastIndex(arr,l,r,b);

            System.out.println((y-x)+1);
        }

    }


    public static int searchFirstIndex(int[] arr, int l, int r, int a){

        while(l+1<r){
            int mid= (l+r)/2;
            if(predicateForFirstIndex(arr, mid, a)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return r;
    }

    public static int predicateForFirstIndex(int[] arr, int mid, int target){
        if(arr[mid]<target) return 0;
        return 1;
    }

    public static int searchLastIndex(int[] arr, int l, int r, int b){

        while(l+1<r){
            int mid= (l+r)/2;
            if(predicateForLastIndex(arr, mid , b)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        return l;
    }

    public static int predicateForLastIndex(int[] arr,int mid, int target){
        if(arr[mid]<=target) return 0;
        return 1;
    }
}
