package regularExpressionsDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Pattern p= Pattern.compile("ab");
		Matcher m= p.matcher("ababbaba");
		
		
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"......"+m.end()+"..."+m.group());
		}
		System.out.println("The number of occurences"+ count);
	}

}
