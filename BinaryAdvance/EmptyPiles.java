package BinaryAdvance;

import java.util.Scanner;

public class EmptyPiles {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int h =sc.nextInt();

        int[] pile =new int[n];
        int maxR=0; //WE WIL BE FINDING MAX STONES IN A PILE

        for(int i=0; i<n; i++){
            pile[i]=sc.nextInt();
            if(maxR<pile[i]){
                maxR=pile[i];
            }
        }
        int L=0, R=maxR;

        while(L+1<R){
            int mid=L+(R-L)/2;
            if(predicate(pile,mid,h,n)==0){
                L=mid;
            }else{
                R=mid;
            }
        }
        System.out.print(R);
    }
    public static int predicate(int[] pile, int mid, int h, int n) {
        int numOfOperations = 0;
        for (int i = 0; i < n; i++) {
            double op = (double)pile[i] / (double)mid;
            numOfOperations += Math.ceil(op);
        }

        if (numOfOperations <= h) {
            return 1;
        } else {
            return 0;
        }
    }
}
