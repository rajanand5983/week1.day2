package week1.day2;

public class Calculator1 {
	public void add(int a, int b) {
		System.out.println(a+b);
		
		

	}
	public void sub(int a,float b) {
		System.out.println(a-b);
		

	}
	
	public void multi(double a,int b,double c) {
		System.out.println(a*b*c);
		
	
	}
    public void div(long a,double b,float c ) {
    	System.out.println(a/b/c);
		

	}
    public static void main(String[] args) {
		Calculator1 cal=new Calculator1();
		cal.add(12, 10);
		cal.sub(20, 10);
		cal.multi(10, 20, 30);
		cal.div(150, 100, 30);
		
		
	}
}
