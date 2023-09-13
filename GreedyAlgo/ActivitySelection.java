package GreedyAlgo;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int TestCases= sc.nextInt();

        while(TestCases-->0){
            int n=sc.nextInt();
            Segment[] ar = new Segment[n];  //Create an array to store Segment objects

            for (int i = 0; i < n; i++){
                int L=sc.nextInt();
                int R=sc.nextInt();

                ar[i]= new Segment(L,R); //WE STORING OBJECT ON L,R INTO ARRAY LOCATION
            }
            Arrays.sort(ar, Comparator.comparingInt(s -> s.end)); //here 's' is a temporary variable that represents each 'Segment'

            int largestGoodSubset=1;
            int currentEnd =ar[0].end;

            for(int i=1; i<n; i++){

                if(ar[i].start>currentEnd){
                    // This segment does not intersect with the previous segments
                    largestGoodSubset++;
                    currentEnd=ar[i].end;  // Update the current ending point
                }
            }
            System.out.println(largestGoodSubset);
        }

    }


}

class Segment{
    int start= -1;
    int end = -1;
    Segment(int x, int y){
        this.start=x;
        this.end=y;
    }
}

/* the Segment class is a simple data structure used to encapsulate the starting and ending points of a line segment and provide a convenient way to create and store these segments as objects. In the code, you can see that instances of this class are created for each line segment read from the input and stored in an array for further processing.*/
