package Searching_I;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        double l= -1.0, r=1000000000000000.0;
        double mid=0.0;
        if(n==0){ System.out.println("0"); return; }
        int steps=150;

        while(steps-->0){
            mid=(l+r)*0.5;     //same as (l+r)/2

            if (predicate(mid,n) == 0){
                l=mid;
            }else{
                r=mid;
            }
        }

        System.out.print(mid);
    }

    public static int predicate(double mid,long n){
        if(mid*mid<n){
            return 0;
        }else{
            return 1;
        }
    }
}
