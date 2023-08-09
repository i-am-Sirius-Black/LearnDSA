package Arrays;
import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class TreasureRoomV2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int w = sc.nextInt();
            int arr[] = new int[n];
            boolean found =false;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                int find = w - arr[i];
                int ans[]=twoSum(arr,i+1,n, find);

                if(ans.length==1)continue; //if twoSum Method returns -1 then arrays length will be 1

                    else {
                    found=true;
                    System.out.println(i+1+" "+ans[0]+" "+ans[1]);
                    break;
                }
            }
            if(!found){
                System.out.println("-1");
            }
        }
    public static int[] twoSum(int arr[],int start,int end, int find) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;

        for (int i=start; i < end; i++) {
            if (map.containsKey(find - arr[i]) && map.get(find - arr[i]) != map.get(arr[i])) {

                return new int[]{map.get(find - arr[i]), i + 1};
            }
            map.put(arr[i], i + 1);
        }
        return new int[]{-1};
    }
}
