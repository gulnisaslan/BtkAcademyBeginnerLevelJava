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
		System.out.println("Say� mevcuttur");
	}else {
		System.out.println("Say� mevcut de�ildir."); 
	}

	}

}
