package week2.day1assignments;

public class Mobile {

	public void makeCall() {
		System.out.println("Call made successfully");
		String mobileModel = "Nokia";
		float mobileWeight = 10.11f;
	}
	
	public void sendMsg() {
		System.out.println("Message sent successfully");
		boolean fullCharged = true;
		int mobileCost = 15000;	
	}
	
	public static void main(String[] args) {
		Mobile nka = new Mobile();
		nka.makeCall();
		nka.sendMsg();
		System.out.println("This is my mobile");

}
}


	

