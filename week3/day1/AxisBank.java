package week3.day1;

public class AxisBank extends HomeLoan {

	public static void main(String[] args) {

		// RBI rb=new RBI(); cannot instantiate /create object for the interface

		AxisBank ob = new AxisBank();
		ob.kycDocument("Aadhar");
		ob.basicAmount();
		ob.itFile();
		ob.salesDeed();
		ob.basicAmount();

	}

	
	@Override
	public void withdrawalLimit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kycDocument(String doc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float rofInt(float roi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void itFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salesDeed() {
		// TODO Auto-generated method stub
		
	}

	

}
