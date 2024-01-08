package BinaryAdvance;

import java.util.Arrays;
import java.util.Scanner;
public class Transport {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt(); //number of buses
        int c=sc.nextInt(); //capacity of buses
        int []arrival_time= new int[n];

        int max_time=0;
        for(int i=0; i<n; i++){
            int time= sc.nextInt(); // storing arrival time in temporary var called time.
            arrival_time[i]=time; // then storing that in arrival time array
            max_time = Math.max(max_time, time);
        }
        //sort array
        Arrays.sort(arrival_time);

        int l=-1, r=max_time;

        while(l+1<r){
            int mid = l+(r-l)/2;

            if(predicate(mid,m,c,arrival_time)==0){
                l=mid;
            }else{
                r=mid;
            }
        }
        System.out.print(r);
    }

    public static int predicate(int mid, int m, int c, int []arrival_time){
        int bus_required =minBusRequired(mid,c,arrival_time);
        if(bus_required<=m) return 1;
        return 0;
    }

    public static int minBusRequired(int max_waiting, int capacity, int []person){

        int bus_required =1;
        int firstPerson =person[0]; //time taken by first person to board bus
        int currentlyBoarded=1;
        for(int i=1; i<person.length; i++){
            if( (person[i] - firstPerson) > max_waiting || currentlyBoarded+1 > capacity){
                bus_required ++;
                firstPerson=person[i];
                currentlyBoarded=1;
            }else{
                currentlyBoarded++;
            }
        }
        return bus_required;

    }
}
