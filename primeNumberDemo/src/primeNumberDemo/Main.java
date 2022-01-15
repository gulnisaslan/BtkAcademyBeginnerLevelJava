package primeNumberDemo;

public class Main {

	public static void main(String[] args) {
		int number=23;
		boolean isPrime =true;
		
		if (number==1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if (number<1) {
			System.out.println("Geçersiz Sayý");
			
		}
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime = false;
				
			}
		}
		if (isPrime) {
			System.out.println("Sayý asaldýr.");
		} else {
			System.out.println("Sayý asal deðildir.");

		}
	}

}
