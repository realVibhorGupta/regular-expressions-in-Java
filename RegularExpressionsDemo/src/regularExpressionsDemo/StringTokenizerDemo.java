package regularExpressionsDemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	StringTokenizer st=new StringTokenizer("vibhor gupta is the best");
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
			
	}

}
