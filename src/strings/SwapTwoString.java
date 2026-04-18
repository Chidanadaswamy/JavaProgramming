package strings;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1);
		System.out.println(s2); 
		//using temp 
//		String temp = s1;
//		s1 = s2;
//		s2 = temp;
		
		//using inbuilt method substring()
	    s1 = s1+s2;
		s1 = s1.substring(s1.length());
		s2 = s1.substring(0,s1.length());
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
