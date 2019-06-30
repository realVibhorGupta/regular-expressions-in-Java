package regularExpressionsDemo;

public class StringClassSplitMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s="vibhor gupta is the best";
		
			String[] s1	=s.split("\\s");
		
			for(String s2:s1)
			{
				System.out.println(s2); 
			}
			
	}

}
