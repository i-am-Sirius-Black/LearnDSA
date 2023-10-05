package BinaryAdvance;
import java.util.Scanner;
public class MaxCandies {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long  i=sc.nextLong();

        if(i==0 || i==1){ System.out.print(i); return;}

        long start =0; long end=2000000000; /* end=[2*10^9]   */

        while(start+1<end){
            long mid = start+ (end-start)/2;

            if(predicate(mid, i)==0){
                start= mid;
            }else{
                end=mid;
            }
        }
        System.out.print(start);
    }

    public static int predicate(long mid,long i){
        long sum = (mid*(mid+1))/2;

        if(sum>i){
            return 1;
        }else return 0;
    }

}

