package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,3,4,5};
		int aranacak=8;
		boolean varMi=false;
		
	for (int sayi: sayilar) {
		if (sayi==aranacak) {
			varMi=true;
			break;
		}
	}
	if (varMi) {
		mesajVer("say� mevcuttur: " +aranacak)
		;
	}else {
		System.out.println("Say� mevcut de�ildir."+aranacak); 
	}
	}

	public static void mesajVer(String mesaj) {
		System.out.println("Say� mevcuttur"+mesaj);
	}
	

}
