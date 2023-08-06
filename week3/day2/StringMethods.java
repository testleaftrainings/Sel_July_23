package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		String str="Learning String in Java Session";

		String replaceAll = str.replaceAll(" ", "#");
		System.out.println(replaceAll);
		
		String s="8,999";
		String replace = s.replace(",", "");
		System.out.println(replace+5);
		
		//convert the string into integer
		int price= Integer.parseInt(replace);
		System.out.println(price+5);
		
		String pr="Rs,1200";
		
		System.out.println(pr.replaceAll("[^a-zA-Z]",""));
		
		
		String num = pr.replaceAll("[^0-9]", "");
		System.out.println(Integer.parseInt(num));
		
		
	}

}
