package week1.day2;

public class OddNumbersInRange {
public static void main(String[] args) {
	int startrange = 1;
	int endrange = 20;
	int num;
	System.out.println("Printing only the odd numbers from 1 to 20");
	for (int i = startrange; i <= endrange; i++) {
		num= i % 2;
		if (num == 1) {
			System.out.println(i);
		}
}
}
}
	

	
