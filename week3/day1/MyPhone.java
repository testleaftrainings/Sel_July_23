package week3.day1;

public class MyPhone {
	
	public static void main(String[] args) {
		IPhone oppo=new IPhone();
		oppo.increaseVolume();
		oppo.sendSms();
		oppo.makeCall();
		oppo.startApp();
		oppo.shutDown();
	
		
		// oppo.watchVideo() from IPad
		
		IPad ip=new IPad();
		ip.increaseVolume();
		
	}

}
