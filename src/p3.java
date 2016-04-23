/**
 * Created by kenshinji on 4/21/16.
 */
public class p3 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p3().run());
    }

    public String run() {
        Long target = 600851475143l;
        Long start = 2l, max = 2l;
        while (start <= target) {

            while (target % start == 0) {
                target = target / start;
            }
            if (target == 1) {
                return String.valueOf(start);
            }
            start++;
        }
        return "Not found";
    }
}
