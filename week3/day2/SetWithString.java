package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetWithString {

	public static void main(String[] args) {
		String S="TestLEaf";
		String lowerCase = S.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		Set<Character> uniq=new LinkedHashSet<Character>();
		
		for(int i=0;i<charArray.length;i++) {
			uniq.add(charArray[i]);
		}

		System.out.println(uniq);
		
	}

}
