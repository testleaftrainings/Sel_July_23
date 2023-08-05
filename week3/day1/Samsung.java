package week3.day1;

public class Samsung extends AndroidTv{

	public static void main(String[] args) {
		 Samsung s=new Samsung();
		 s.openApp();
		 s.watchVideo();

	}

	@Override
	public void watchVideo() {
		System.out.println("Watch video");
	}

	
	
}
