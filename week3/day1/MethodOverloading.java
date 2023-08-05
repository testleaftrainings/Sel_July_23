package week3.day1;

public class MethodOverloading {
	
	public void add() {
		System.out.println("Add functionality");
	}
	
	
	public int add(int a,int b) {
		System.out.println("Add functionality" );
		return a+b;
	}
	
	public float add(float c,float d) {
		System.out.println("Add functionality" );
		return c+d;
	}
	
	public void empDetails(String name ,long phno) {
		
	}
	
   public void empDetails(String add,String name,int empId) {
		
	}
	

   public void empDetails(int n ,long p) {
		
	}
	
   
   
	public static void main(String[] args) {
		
		MethodOverloading cal=new MethodOverloading();
		int add = cal.add(10, 20);
		System.out.println(add);
	}

}
