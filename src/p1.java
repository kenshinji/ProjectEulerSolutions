public class p1 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p1().run());

    }

    public String run() {
        int result = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return Integer.toString(result);
    }

}
