package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
	List<String> mentors =new ArrayList<String>();
	mentors.add("Aravind");
	mentors.add("Raghu");
	mentors.add("Princila");
	mentors.add("Subraja");
	
	System.out.println(mentors);
	
	String string = mentors.get(3);
	System.out.println(string);
	
	mentors.add(1,"Mukesh");
	
	System.out.println(mentors);
	
	mentors.remove(2);	
	System.out.println(mentors);
	
	
	mentors.set(1, "Jagdeesh");
	System.out.println(mentors);
	
	int size = mentors.size();
	System.out.println(size);
	
	List<String> mentorName=new ArrayList<String>();
	boolean empty = mentorName.isEmpty();
	System.out.println(empty);
	
	mentorName.addAll(mentors);
	System.out.println(mentorName);
	
	
	for(int i=0;i<mentorName.size();i++)
	{
		System.out.println(mentorName.get(i));
	}
	
	mentors.add("Vidya");
	//remove the common ele in comperision with two lists
	//mentors.removeAll(mentorName);
	
	//remove the unique ele
	mentors.retainAll(mentorName);
	
	mentors.clear();
	System.out.println(mentors);
	
	boolean contains = mentorName.contains("Vidya");
	System.out.println(contains);	
	
	}

}
