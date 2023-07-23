package week1.day2;

public class LearnArray {

	public static void main(String[] args) {
		
		
		/*
		 * //datatype[] name={values}; //length property of array int[] age=
		 * {45,32,1,56,87}; int length2 = age.length; int[] score= {98,97,87,68,87};
		 * //use index to get the value from a particular position //0 1 2 3 4 //index
		 * starts with zero //to know the number of the elements in the array //ctrl 2 l
		 * int length = score.length; System.out.println(length);
		 * System.out.println(score[2]); System.out.println(score[length-1]);
		 * //ArrayIndexOutOfBoundsException //to reterive the last element from the
		 * array arr[length-1]
		 * 
		 * // to print all the values from the array System.out.println(score);//not
		 * possible to print all the values of an array
		 * 
		 * for(int i=0;i<=length-1;i++) { System.out.println(score[i]); }
		 * 
		 * 
		 * for(int i=length;i>=0;i--) {//5 4 3 2 1-->4,3,2,1,0
		 * System.out.println(score[i]); }
		 */
		
		//Array is always fixed in length
		//Declaring array using object
		
		//datatype[] arrName=new datatype[size];
		
		int[] numbers=new int[5];
		numbers[0]=12;
		numbers[1]=13;
		numbers[4]=11;
		System.out.println(numbers[5]);
		
		
		
	}

}
