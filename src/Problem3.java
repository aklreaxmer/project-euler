
public class Problem3 {
	public static void main(String[] args) {
		long num = 600851475143L;
		int largest = 1;
		for(int i = 6; i <= num; i++)
		{
			if( i > 10 && num % i == 0 && Util.isPrime(i) && Util.isOdd(i))
					largest = i;
		}
		System.out.println("Answer: " + largest);
	}
}
