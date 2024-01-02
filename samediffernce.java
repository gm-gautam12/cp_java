import java.util.*;

public class samediffernce {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();
        while (tests-- > 0) {
        int n = scanner.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        long res = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            x -= i;
            res += a.getOrDefault(x, 0);
            a.put(x, a.getOrDefault(x, 0) + 1);
        }
        System.out.println(res);
        }
    }
}
