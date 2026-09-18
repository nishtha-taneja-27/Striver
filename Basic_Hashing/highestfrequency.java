package Basic_Hashing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class highestfrequency {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();

        
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } 
            else {
                map.put(arr[i], 1);
            }
        }

        int max = 0;
        int min = n + 1;

        int maxElement = 0;
        int minElement = 0;

        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                maxElement = entry.getKey();
            }

            if (entry.getValue() < min) {
                min = entry.getValue();
                minElement = entry.getKey();
            }
        }

        System.out.println("Highest occurring: " + maxElement);
        System.out.println("Least occurring: " + minElement);

        sc.close();
    }
}