package String;

public class dotEqual {

	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = new String("abc");
		String s4 = "abc";
		
		if(s1.equals(s2))
		{
			System.out.println("Data matched s1 & s2");
		}
		else if (s1.equals(s3))
		{
			System.out.println("Data matched s1 & s3");
		}
		else if(s1.equals(s4))
		{
			System.out.println("Data matched s1 & s4");

		}
		
	}

}
