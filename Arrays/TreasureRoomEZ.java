package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreasureRoomEZ {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int w=sc.nextInt();

        boolean found =false;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=1;i<=n; i++){
            int num=sc.nextInt();
            map.put(num,i);
        }

        for(int k:map.keySet()){
            //7
            if(map.containsKey(w-k)){

                System.out.print(map.get(k)+" "+map.get(w-k));
                found=true;
                break;
            }
        }

        if(!found){
            System.out.print("-1");
        }
    }
}
