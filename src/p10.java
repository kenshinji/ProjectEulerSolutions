import java.util.Arrays;

/**
 * Created by kenshinji on 4/28/16.
 */
public class p10 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p10().run());
    }

    @Override
    public String run() {

        return Long.toString(sieveAndSum(2000000));
    }

    private long sieveAndSum(int n) {
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve,true);
        sieve[0] = sieve[1] = false;
        int i = 2;
        long sum = 0l;
        while (i * i <= n) {
            if (sieve[i]) {
                int k = i * i;
                while (k <= n) {
                    sieve[k] = false;
                    k = k + i;
                }
                sum += i;
            }
            i++;
        }
        for(int k = i;i<n;i++) {
            if (sieve[i]) {
                sum += i;
            }
        }
        return sum;
    }
}
