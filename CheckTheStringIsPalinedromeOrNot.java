public class CheckTheStringIsPalinedromeOrNot
{
	public static void main(String args[])
	{
		palinedromeOrNot("niti");
		if(palinedromeOrNot1("niti"))
		{
			System.out.println("is Palinedrome");
		}
		else
		{
			System.out.println("Not Palinedrome");
		}
		palinedromeOrNot2("nitin");
	}
	public static void palinedromeOrNot(String str)
	{
		String str1 = str ;
		StringBuffer sb = new StringBuffer(str);
		if(str1.equals(sb.reverse().toString()))
		{
			System.out.println("is Palinedrome");
		}
		else
		{
			System.out.println("Not Palinedrome");
		}
	}
	public static boolean palinedromeOrNot1(String str)
	{
		int l = 0;
		int r = str.length() - 1;
		while(r > l)
		{
			if(str.charAt(l) != str.charAt(r))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	public static void palinedromeOrNot2(String str)
	{
		char[] ch = str.toCharArray();
		char[] ch1 = new char[ch.length];
		int j = 0 ;
		for(int i = ch.length - 1 ; i >= 0 ; i-- )
		{
			ch1[j] = ch[i];
			j++;	
		}
		if(String.valueOf(ch).equals(String.valueOf(ch1)))
		{
			System.out.println("is Palinedrome");
		}
		else
		{
			System.out.println("Not Palinedrome");
		}
	}
}