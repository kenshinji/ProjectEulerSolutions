import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by kenshinji on 4/26/16.
 */
public class p5 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p5().run());
    }

    @Override
    public String run() {
        int result = 1;
        Integer[] tars = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20};
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(tars));
        ArrayList<Integer> nonPrimes = new ArrayList<>();
        for (Integer e : set) {
            if (isPrime(e)) {
                result = result * e;
            } else {
                nonPrimes.add(e);
            }
        }

        Iterator<Integer> it = nonPrimes.iterator();
        while (it.hasNext()) {
            int min = it.next();
            int divisor = findMaxCommonDivisor(result, min);
            result = result * (min / divisor);
        }


        return Integer.toString(result);
    }

    private int findMaxCommonDivisor(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (m % n == 0) {
            return n;
        } else {
            return findMaxCommonDivisor(n, m % n);
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
