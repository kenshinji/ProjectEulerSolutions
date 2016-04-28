/**
 * Created by kenshinji on 4/28/16.
 */
public class p6 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p6().run());
    }

    @Override
    public String run() {
        return Integer.toString(SqrOfSum(100) - SumOfSqr(100));
    }

    private int SumOfSqr(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++) {
            sum += i * i;
        }
        return sum;
    }

    private int SqrOfSum(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++) {
            sum += i;
        }
        return sum * sum;
    }
}
