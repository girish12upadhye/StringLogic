public class RemoveDigitFromString
{
	public static void main(String args[])
	{	
		String str = "Java1prog2ram1";
		removeDigit(str);
		removeDigit1(str);
	}
	public static void removeDigit(String str)
	{
		int count = 0;
		String result = " "; 
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}	
			else
			{
				result = result + str.charAt(i);
			}
		}
		System.out.println("After removing digit from string : "+result +"\nNumber of digit in string are : "+count);
	}
	public static void removeDigit1(String str)
	{
		System.out.println(str.replaceAll("\\d",""));
	}
}