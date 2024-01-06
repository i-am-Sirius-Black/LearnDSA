package BinaryAdvance;

import java.util.Scanner;

public class BoxPacking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long w = sc.nextLong();
            long h = sc.nextLong();
            long n = sc.nextLong();

            long l=0, r=1;

            //we are finding the upper bound for r
            // means we start r from 1 and keep doubling it until (r/w)*(r/h)<n returns false
            // using it we can find r efficiently which is neither too big value nor too small to not be able to fit all the boxes
            while(predicate(r, w, h , n)){
                r*=2;
            }

            long result = SquareSize(w,h,n,l,r);
            System.out.println(result);
        }
    }

    public static long SquareSize (long w, long h, long n, long l, long r){

        while((l+1)<r){
            long mid =(l+(r-l)/2);

            if(predicate(mid, w, h, n)){
                l=mid;
            }else{
                r=mid;
            }
        }
        return r;
    }
    public static boolean predicate(long mid, long w, long h, long n){
        return (mid/w)*(mid/h)<n;
    }
}
