public class SNJava2
{

	public static int myInt(String myValue, int base)
	{
	    int place = 1;
	    int sum = 0;
	    String basalMultiplier = "0123456789";
	    for (int s = myValue.length()-1; s > 0; s--)
		    {
		        for (int m = 0; m < basalMultiplier.length(); m++)
		        {
		            if(myValue.charAt(s) == basalMultiplier.charAt(m))
		            {
		                sum = sum + (m * place);
		            }
		        place = place * base;
		        }
		    }
	    return sum;
	}
	public static void main(String[] args)
	{
int answer = myInt("11011101",2);
System.out.print(answer);
	}
}
//currPosInString is s
//currPosinbasalMulitiplier is m
