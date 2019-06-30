package regularExpressionsDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringTokenizer st=new StringTokenizer("7-29-2015","-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
