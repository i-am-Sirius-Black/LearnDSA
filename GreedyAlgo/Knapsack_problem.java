package GreedyAlgo;

import java.util.*;
public class Knapsack_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double given_cap = sc.nextInt();

        Knapsack ar[] = new Knapsack[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int weight = sc.nextInt();
            ar[i] = new Knapsack(value, weight);
        }
        Arrays.sort(ar, (a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double maxValue = getMaxValue(ar, given_cap);
        System.out.print(maxValue);
    }

    public static double getMaxValue(Knapsack[] ar, double given_cap) {

        double curr_cap = given_cap;
        double max_val = 0.0;

        for (int i = 0; i < ar.length; i++) {

            if (curr_cap >= ar[i].weight) {
                max_val += ar[i].value;
                curr_cap -= ar[i].weight;

            } else {

                max_val += (curr_cap * ((double) ar[i].value / (double) ar[i].weight));
                break;
            }

        }
        return max_val;

    }
}


    class Knapsack{
        int value=0;
        int weight=0;

        Knapsack(int x, int y){
            this.value=x;
            this.weight=y;
        }
    }

