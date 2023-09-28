package GreedyAlgo;

import java.util.*;

public class MinBuses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long max_wait=sc.nextInt();
        long max_cap=sc.nextInt();   /*Max bus capacity*/

        long []passenger = new long[n];

        for(int i=0; i<n;  i++){
            passenger[i]=sc.nextInt();
        }
        Arrays.sort(passenger);
        System.out.print( getMinBuses(passenger,max_wait,max_cap) );
    }

    public static int getMinBuses(long []ar, long max_wait, long max_cap){

        int bus_count = 1;
        long current_capacity = 1;
        long first_person =ar[0];

        // first person will decide how long the bus will wait.
        // current_capacity will decide when the bus will leave.

        for(int i=1; i<ar.length;  i++){
            // arrival_time[i] - first_person is the duration the bus has to wait if it has to take him.
            if((ar[i]-first_person)>max_wait || current_capacity+1 > max_cap) /*The condition current_capacity+1 > max_cap "plus one" checks if adding one more passenger to the current bus would cause it to exceed its maximum capacity.*/
            {
                // if we reach here, that means we have taken a new bus
                bus_count++;
                first_person = ar[i];
                current_capacity=1;
            }else{
                current_capacity++;

            }
        }

        return bus_count;
    }
}
