public class Problem2 {

	public static void main(String[] args) {
		int sum = 0, last = 0, fib = 1;
		for (int i = 0; sum <= 4000000; i++) {
			i = fib;
			fib += last;
			last = i;

			if (fib % 2 == 0)
				sum += fib;
		}
		System.out.println("Answer: " + sum);
	}
}
