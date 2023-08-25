package RangeSum_Sphinx;

import java.util.Scanner;

public class RangeSums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        long prefixSum[]=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
             sum=sum+arr[i];
             prefixSum[i]=sum;
        }
        int q=sc.nextInt();
        System.out.println();
        while(q-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            if(l==1){
                System.out.println(prefixSum[r-1]); //in 0 to n indexing 5 will become 6 that is why we minus 1
            }else {
                System.out.println(prefixSum[r - 1] - prefixSum[l - 2]); // same as above
            }
        }

    }
}
