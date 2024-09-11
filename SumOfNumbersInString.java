import java.util.Scanner;

public class SumOfNumbersInString 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String str = sc.nextLine();
    sc.close();
    int sum = 0;
    for (int i = 0; i < str.length(); i++) 
    {
      if (Character.isDigit(str.charAt(i))) 
      {
        int j = i;
        while (j < str.length() && Character.isDigit(str.charAt(j))) 
        {
          j++;
        }
        sum = sum + Integer.parseInt(str.substring(i, j));
        i = j - 1;
      }
    }
    System.out.println("Sum of numbers in the string: " + sum);
  }
}

