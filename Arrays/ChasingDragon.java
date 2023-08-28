package Arrays;

import java.util.Scanner;

public class ChasingDragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] city = new long[n+1];

        for (int i = 1; i <= n; i++) {
            city[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        long[] prefixSum = new long[n+1];

        //calculating prefixSum
        long sum = 0;
        for (int i = 1; i <=n; i++) {
            sum = sum + city[i];
            prefixSum[i] = sum;
        }

        long maxCost = prefixSum[n];  //for test case 1 maxCost is 17

        //calling method
        int currentPos = 1; //city 1

        for (int i = 1;i<=k; i++) {
            int direction = sc.nextInt(); //1==clockwise,-1==anticlockwise
            long distance = sc.nextLong(); //dragon will travel to attack
            distance= distance % n;
           long[] values= minCost(n, currentPos, direction, distance, prefixSum, maxCost);
           long cost = values[0];

            currentPos = (int) values[1];
            System.out.println(cost);
        }
    }
    public static long[] minCost(int n, int currentPos, int direction, long distance, long[] prefixSum, long maxCost){

        long clockCost, antiCost;
        int attackCity;

        if (direction == 1){
            attackCity = (currentPos + (int) distance) % n;
        }else{
            attackCity = (currentPos - (int) distance + n) % n;
        }

        clockCost=Math.abs(prefixSum[attackCity] - prefixSum[currentPos]);
        antiCost=Math.abs(maxCost - clockCost);

        long cost = Math.min(clockCost, antiCost);
        return new long[]{cost,attackCity};
    }
}
