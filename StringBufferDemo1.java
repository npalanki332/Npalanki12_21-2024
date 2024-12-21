package String;

public class StringBufferDemo1 {

	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer("RBG");
		System.out.println(s1);
	
		System.out.println(s1);
		s1.append(" Technologies");
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Selenium");
		
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer(" with TestNG");
		
//		System.out.println(s2+s3);//concatination not possible as no String available here
		
		System.out.println(s2+""+s3);

	}

}
