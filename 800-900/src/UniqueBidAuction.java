import java.util.HashMap;
import java.util.Scanner;

public class UniqueBidAuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int ii = 0; ii < t; ii++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            int min = Integer.MAX_VALUE;
            for (int i : map.keySet()) {
                if (map.get(i) == 1)
                    min = Math.min(min, i);
            }
            int found = 0;
            for (int i = 0; i < n; i++) {
                if (min == arr[i]) {
                    System.out.println(i+1);
                    found = 1;
                    break;
                }
            }
            if (found == 0)
                System.out.println(-1);
        }
    }
}
