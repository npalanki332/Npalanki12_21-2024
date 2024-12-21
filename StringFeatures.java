package String;

public class StringFeatures {

	public static void main(String[] args) 
	{
		String s1 = "RBG Technologies";
		
		int charcount = s1.length();
		System.out.println(charcount);
		
		char arr[] = s1.toCharArray();
		System.out.println(arr[2]);
		char c1 = s1.charAt(2);
		System.out.println(c1);
		
		String str1[]= s1.split("");
		String strg[]= s1.split("o");
		
		String subString = s1.substring(2);
		System.out.println(subString);
		
		String subString1 = s1.substring(2,8);
		System.out.println(subString1);
		
		String replace = s1.replace("o","$");
		System.out.println(replace);
		
		
		

	}

}
