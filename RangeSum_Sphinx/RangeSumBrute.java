package RangeSum_Sphinx;

import java.util.Scanner;

public class RangeSumBrute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int m=sc.nextInt();

        for(int i=0;i<m;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            l=l-1; r=r-1;
            System.out.println(rangeSum(l,r,arr));
        }
    }

    public static int rangeSum(int l, int r, int arr[]){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}
