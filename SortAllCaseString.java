import java.util.ArrayList;
import java.util.Collections;

public class SortAllCaseString {
	public static void main(String args[])
	{
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("abc");
		s.add("AAbc");
		s.add("bbc");
		s.add("c");
		
		Collections.sort(s, new SortInsesitiveCase()); 
		System.out.println(s);
	}

}
