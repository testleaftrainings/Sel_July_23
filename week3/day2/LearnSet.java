package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
	
		Set<String> mentors=new HashSet<String>();
		//hashing alogrithm
		mentors.add("Aravind");
		mentors.add("Raghu");
		mentors.add("Subraja");
		mentors.add("princila");
		mentors.add("Aravind");
		mentors.add("Jagadeesh");		
		
		System.out.println(mentors);
		
		
		Set<String> mentor=new LinkedHashSet<String>();
		//insertion order
		mentor.add("Aravind");
		mentor.add("Raghu");
		mentor.add("Subraja");
		mentor.add("princila");
		mentor.add("Aravind");
		mentor.add("Jagadeesh");			
		System.out.println(mentor);
		
		Set<String> mentorName=new TreeSet<String>();
		//ASCII order
		mentorName.add("Aravind");
		mentorName.add("Raghu");
		mentorName.add("Subraja");
		mentorName.add("princila");
		mentorName.add("Aravind");
		mentorName.add("Jagadeesh");			
		System.out.println(mentorName);
		
		
		
		
	}

}
