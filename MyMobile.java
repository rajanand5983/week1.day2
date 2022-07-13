package week1.day2;

public class MyMobile {
	int price=12666;
	String name= "asuzz";
	public void makeCall() {
		System.out.println("make call");
		

	}
	public void sendMsg() {
		System.out.println("send msg");

	}
	private void payBills() {
		System.out.println("pay bill");

	}
	public static void main(String[] args) {
		 MyMobile smart=new MyMobile();
		 System.out.println("price"+smart.price);
		 System.out.println("name"+smart.name);
		 smart.makeCall();
		 smart.sendMsg();
		 smart.payBills();
				 
	}

}
