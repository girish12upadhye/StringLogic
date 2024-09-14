import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class ConvertStringInListToUpperCaseAndPrintInStringForm
{
	public static void main(String args[])
	{
		// Using My Own Logic 
		List<String> list1 = Arrays.asList("USA","Japan","France","Germany","Italy","India","Canada");
		
		List<String> list2 = new ArrayList();
		for(String str : list1 )
		{
			list2.add(str.toUpperCase());
		}
		for(String str : list2 )
		{
			System.out.print(str +", ");
		}
		System.out.println();
		// Using Java 8 Stream API
		String str = list1.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(str);
	}
}