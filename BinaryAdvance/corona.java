package BinaryAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class corona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Island islands[] = new Island[m];
        for (int i = 0; i < m; i++) {
            long Li = sc.nextLong();
            long Ri = sc.nextLong();

            Island coordinates = new Island(Li, Ri);
            islands[i] = coordinates;
        }

        //sorting
        Arrays.sort(islands, (i1, i2) -> {
            return (int) (i1.start - i2.start);
        });
        long l = -1, r = 1000000000000000002L;


        while (l + 1 < r) {
            long mid = l + (r - l) / 2;

            if (predicate(mid, islands, n, m) == 0) {
                l = mid;
            } else {
                r = mid;
            }
        }
        System.out.print(l);
    }

    public static int predicate(long maxDistance, Island[] islands, int n, int m) {
        long peopleCanFitOnIsland = getMaxPeople(maxDistance, islands, m);

        if (peopleCanFitOnIsland >= n) {
            return 0;
        }
        return 1;
    }


    public static long getMaxPeople(long maxDist, Island[] islands, int m) {

        long prev_stop = -1000000000000000002L;
        long peopleCanFitOnIsland = 0;
        for (int i = 0; i < m; i++) {

            long startFrom = Math.max(prev_stop + maxDist, islands[i].start);

            if (startFrom <= islands[i].end) {

                long people = ((islands[i].end - startFrom) / maxDist) + 1;
                peopleCanFitOnIsland += people;
                prev_stop = startFrom + ((people - 1) * maxDist);  //example->  for 0,2 and maxDistance 2 -> 0+(2-1)*2; = 2
            }

        }
        return peopleCanFitOnIsland;

    }
}

class Island{
    long start, end;

    Island(long s, long e){
        this.start=s;
        this.end=e;
    }
}
