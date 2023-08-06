package week3.day2;

public class LearnSubstring {

	public static void main(String[] args) {
		
		
		String s="TestLeaf";
		String substring = s.substring(3);
		System.out.println(substring);
		
		String sub = s.substring(1,6);
		System.out.println(sub);
		//end index will be ignored
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);

	}

}
