public class EvenFibNumbers {

	public static void main(String[] args) {
		System.out.println("The sum of the even-valued terms is "
				+ getSum(4000000));
	}

	static int getSum(int limited) {
		int sum = 0;
		int first = 1;
		int second = 2;
		int next = first + second;
		sum = sum + second;
		while (next <= limited) {
			if (next % 2 == 0)
				sum += next;
			first = second;
			second = next;
			next = first + second;

		}
		return sum;
	}

}
