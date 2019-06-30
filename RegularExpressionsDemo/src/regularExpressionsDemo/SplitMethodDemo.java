package regularExpressionsDemo;

import java.util.regex.Pattern;

public class SplitMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("\\.");
		String[] s=p.split("www.google.com");
		for(String s1:s)
		{
			System.out.println(s1);
		}

	}

}
