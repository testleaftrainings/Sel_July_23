package base;

public class LearnThis {
	
	int x;
	
	public LearnThis cal(int x) {
		this.x=x;
		System.out.println(this.x);
		return this;
		//this =new LearnThis();
	}
	
	
	

	public static void main(String[] args) {
		
		new LearnThis().cal(10);
		

	}

}
