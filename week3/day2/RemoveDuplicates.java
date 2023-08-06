package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 int[] arr= {1,2,3,2,4,3,5};
		  
		  
		 Set<Integer> uniq=new LinkedHashSet<Integer>();
		 Set<Integer> dup=new LinkedHashSet<Integer>();
 
			/*
			 * for(int i=0;i<arr.length;i++) { uniq.add(arr[i]); }
			 */
		 
		 //iterate into the each arr value
		 //check for the condition arr value is not added to the uniq Set
		 //add it to the dup
		 
		 for(int i=0;i<arr.length;i++) {
			 boolean add = uniq.add(arr[i]);
			 System.out.println(add);
			 if(!add) {
				 dup.add(arr[i]);
			 }
		 }
		  //arr[1]=2
		 System.out.println(uniq);
		 System.out.println(dup);
		 //for(Wrapperclass variable :setName)
		 for (Integer ele : uniq) {
			System.out.println(ele);
		}
		 
		 //To use index based values from set convert the set to list
		 
		 List<Integer> listNmae=new ArrayList<Integer>(uniq);
		// listNmae.addAll(uniq);
		 for(int i=0;i<listNmae.size();i++) {
			 Integer integer = listNmae.get(i);
			 System.out.println(integer);
	}
		 
		
		 

}}
