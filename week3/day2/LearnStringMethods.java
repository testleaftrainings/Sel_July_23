package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Testleaf";

		s = s.concat("Learning");

		System.out.println(s);

		// to count the characters in the String

		System.out.println(s.length());		
		//to retreive any particular charcter from a given index of string
		char charAt = s.charAt(4);
		System.out.println(charAt);
		
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));			
		}
		
		char[] charArray = s.toCharArray();
		//testleafLearning --> [T,e,s,t,l,e,a,f,L,e,a,r,n,i,n,g]
		for(int i=0;i<charArray.length;i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		

		
	}

}
