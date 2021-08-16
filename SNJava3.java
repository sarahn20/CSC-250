import java.util.Scanner;
public class SNJava3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Give me an binary value: ");
        String s = input.nextLine();
        
        System.out.println(baseToDecimal(s,2));
    }
    
    static String decimalToBase(int decimal, int targetBase)
    {
		int remainder = 0;
		String valueList = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String targetString = "";
		
		while(decimal > 0)
		{
			remainder = decimal % targetBase;
			targetString = valueList.charAt(remainder) + targetString;
			decimal = decimal / targetBase;

		}
		return targetString;
		
    }
    
    static int baseToDecimal(String s, int base)
    {
        int place = 1;
        int sum = 0;
        String valueList = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        //write the code to turn whatever is in s into
        //its integer equivalent in decimal
        for(int sBucket = s.length()-1; sBucket >= 0; sBucket = sBucket - 1)
        {
        	for(int vlBucket = 0; vlBucket < valueList.length(); vlBucket = vlBucket + 1)
        	{
	            if(s.charAt(sBucket) == valueList.charAt(vlBucket))
	            {
	            	sum = sum + (vlBucket * place);
	                place = place * base; 
	            }
        	}
        }
        return sum;
    }
    
}
