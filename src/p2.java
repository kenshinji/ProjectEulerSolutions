public class p2 {

	public static void main(String[] args) {
		System.out.println(new p2().run());
	}

	public String run() {
		int sum = 0;
		int first = 1;
		int second = 2;
		int next = first + second;
		sum = sum + second;
		while (next <= 4000000) {
			if (next % 2 == 0)
				sum += next;
			first = second;
			second = next;
			next = first + second;

		}
		return Integer.toString(sum);
	}
}
