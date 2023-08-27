package week6.day2;

public class LearnStatic {

	int empId;
	String empName;
	static String companyName="wipro";
	
	
	public void empDetails(int id ,String name) {
		empId=id;
		empName=name;
				
	}
	
	public static void cname() {
		System.out.println("Company name is " +companyName);
	}
	
	public void printDetails() {
		System.out.println("Employee details :" +empId +" " +empName +" "+companyName);
	}
		
	public static void main(String[] args) {
	
		LearnStatic st=new LearnStatic();
		st.empDetails(01,"Karthika");
		LearnStatic st1=new LearnStatic();
		st1.empDetails(02, "Vikas");
		st1.printDetails();
		System.out.println(companyName);		
	cname();
		
	}

}
