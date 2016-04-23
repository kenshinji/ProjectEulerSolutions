/**
 * Created by kenshinji on 4/21/16.
 */
public class p3 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p3().run());
    }

    public String run() {

        //return Integer.toString(nextPrime(15));
        Long target = 600851475143l;
        Long start = 2l, max = 2l;
        while (start < target) {
            if (target % start != 0) {
                start = nextPrime(start) == start ? start + 1 : nextPrime(start);
            }
            if (target % start == 0) {
                target = target / start;
                max = start;
            }
        }

        return String.valueOf(max);

    }


    private Long nextPrime(Long n) {
        Long next_prime = n;
        while (true) {
            Long next_prime_sqrt = (new Double(Math.sqrt(next_prime))).longValue();
            boolean is_odd = true;
            for (Long i = 2l; i < next_prime_sqrt + 1; i++) {
                if (next_prime % i == 0) {
                    is_odd = false;
                    break;
                }
            }
            if (is_odd) {
                return next_prime;
            }
            next_prime++;
        }
    }


}
