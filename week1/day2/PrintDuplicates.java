package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};

		Arrays.sort(nums);
		//2,2,3,5,5,7,7,9
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1])//nums[0] ==(nums[0+1]) nums[1]
		
			{
				System.out.println(nums[i]);
			}
		}
		
		
		
		
	}

}
