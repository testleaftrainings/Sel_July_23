package week1.day2;

public class PrintDipM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		
		
		for(int i=0;i<nums.length;i++) {//outer loop
			for(int j=i+1;j<nums.length;j++) {//inner loop
				if(nums[i]==nums[j]) {
					System.out.println(nums[j]);
				}
			}
		}
		
		
		

	}

}
