package week3.day2;

public class WordCount {

	public static void main(String[] args) {
		String str="Learning String in Java Session";
		
		//In string " " --> ?$  -->character
		System.out.println(str.length());
		
		String[] split = str.split("r");
		
		//split[0]=Learnin
		//split[1]= Strin
		//split[2]=  in Java Session
		
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		int length = split.length;
		System.out.println(length);
		
		
		
		

	}

}
