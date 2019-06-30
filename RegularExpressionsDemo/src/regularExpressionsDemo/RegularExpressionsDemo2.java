package regularExpressionsDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("[[^abc0-9],[abc0-9]]");
		Matcher m=p.matcher("a7b@2#9");
		
		while(m.find())
			
			
		{
			System.out.println(m.start()+"....."+m.end()+"......"+m.group());
		}
	
	}

}
