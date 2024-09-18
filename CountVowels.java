public class CountVowels
{
	public static void main(String args[])
	{
		String str = "agireisuho";
		int vcount = 0 ,ccount = 0 ;
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(isVowels(str.charAt(i)))
			{
				vcount++ ;
			}
			else
			{
				ccount++ ;
			}
		}
		System.out.println("Num of vowels : "+vcount);

		System.out.println("Num of Consonant : "+ccount);
	}
	public static boolean isVowels(char ch)
	{
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}
}