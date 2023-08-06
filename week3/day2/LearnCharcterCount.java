package week3.day2;

public class LearnCharcterCount {

	public static void main(String[] args) {
		String s="Testleaf";
		String ExpectChar ="e";
		int count =0;
		
		char[] charArray = s.toCharArray();
		
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='e') {
				count++;
			}
		}
		
		System.out.println("The count of " +ExpectChar + " in the String is  "+count);
		
		
	}

}
