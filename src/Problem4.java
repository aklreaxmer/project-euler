
public class Problem4 {
	public static void main(String[] args) {
	
		int largest = 0;
		String productString;
		for(int i = 100; i < 1000; i++)
		{
			for(int j = 100; j < 1000; j++)
			{
				int product = i *j;
				if(product > largest)
				{
					productString = product + "";
					boolean palindrome = true;
					for(int x = 0; x < productString.length()/2; x++)
					{
						palindrome = productString.charAt(x) == productString.charAt(productString.length()-x-1);
						if(!palindrome)
							break;
					}
					if(palindrome)
						largest = i * j;
				}	
			}
		}
		System.out.println("Answer: " + largest);
	}
}
