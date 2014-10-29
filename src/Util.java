
public class Util {

	public static boolean isPrime(int num)
	{
		boolean prime = true;
		if(num % 2 == 0)
			return true;
		for(int i = 3; i*i <= num; i++)
			if(num % i == 0)
				return false;
		return prime;
		
	}

	public static boolean isOdd(int num) {
		return !(num % 2 == 0);
	}
}
