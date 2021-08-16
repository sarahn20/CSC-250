public class SNJava1
{

	public static void main(String[] args)
	{
		for (int i=1; i<=1000; i = i + 1)
		{
			if (i%3==0 && i%4==0)
			{
				System.out.println("fizzbuzz");
			}
			else if (i%3==0)
			{
				System.out.println("fizz");
			}
			else if (i%4==0)
			{
				System.out.println("buzz");
			}

		}

	}

}
