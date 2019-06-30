package regularExpressionsDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".");
		Matcher m=p.matcher("a7b@2#9r  td ehr, 473bvhgfWFGH");
		
		while(m.find())
			
			
		{
			System.out.println(m.start()+"....."+m.end()+"......"+m.group());
		}
	
	}

}
