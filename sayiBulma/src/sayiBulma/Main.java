package sayiBulma;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3,4,5};
		int aranacak=5;
		boolean varMi=false;
		
	for (int sayi: sayilar) {
		if (sayi==aranacak) {
			varMi=true;
			break;
		}
	}
	if (varMi) {
		System.out.println("Sayý mevcuttur");
	}else {
		System.out.println("Sayý mevcut deðildir."); 
	}

	}

}
