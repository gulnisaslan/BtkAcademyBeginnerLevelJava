package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		customerManager.add();
		customerManager.delete();
		customerManager.update();
        
		
		//value
		int sayi1=20;
		int sayi2=30;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//referance
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		
	}

}

