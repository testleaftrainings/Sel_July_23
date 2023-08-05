package week3.day1;

public class SBI implements RBI, CibilScore{

	

	@Override
	public void withdrawalLimit() {	
		System.out.println("50,000 per day");
		
	}

	@Override
	public void kycDocument(String doc) {
		System.out.println("PAN");
	}

	@Override
	public float rofInt(float roi) {
	System.out.println("8% ");
	return roi;
		
	}

	@Override
	public void itFile() {
		// TODO Auto-generated method stub
		
	}

}
