/* funda for this is simply t prime hmesa prime ka square hoga...yhi apan ke check kiya h
 * hmne ek seive array liya usme sare prime ko true mark kr diya or unke multiple ko false.
 * fir hmne check kiya ki agar hmara k say ..iska square x ke barabar aata h or x index seive m true h toh 
 * ye tprime h
 */
import java.util.*;

public class tprime {
    static boolean[] isPrime;

    public static void getPrimes() {
        int n = 1000000;
        isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        getPrimes();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            long k = (long) Math.sqrt(x);
            if (k * k == x && isPrime[(int)k]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
