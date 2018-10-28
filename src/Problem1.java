
public class Problem1 {
	
	public static void main(String[] args) {
		# summing all the numbers 
		int sum = 0;
		
		for(int i = 0; i < 1000; i++)
			if(i % 5 == 0 || i % 3 == 0)
				sum += i;
		
		# print le sum
		# this counts as a pull request rite
		System.out.println("Answer: " + sum);
	}

}
