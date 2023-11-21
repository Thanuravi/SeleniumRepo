package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel="Iphone14";
		float mobileWeight=90.50f;
		System.out.println("mobileModel:"+mobileModel+",  mobileWeight:"+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=65000;
		System.out.println("isFullCharged:"+isFullCharged+",  mobileCost:"+mobileCost);
	}

	public static void main(String[] args) {
// Create 2 methods (makeCall() , 
		//sendMsg()) with simple print statement
		
		Mobile obj=new Mobile();
		System.out.println("This is my mobile");
		obj.makeCall();
		obj.sendMsg();	
		System.out.println("Make a Call and Send Message");
		
	}

}
