public class StringtwoIsRotationOfSecond
{
	public static void main(String args[])
	{
		String str1 = "cloudtech";
		String str2 = "tehccloud";
		if(rotationOrNot(str1,str2))
		{
			System.out.println("String 2 Is Rotation Of 1 !!!");
		}
		else
		{
			System.out.println("String 2 Is Not Rotation Of 1 !!!");
		}
	}
	public static boolean rotationOrNot(String str1,String str2)
	{
		return (str1.length() == str2.length() && (str1+str1).indexOf(str2) > -1);
	}
}