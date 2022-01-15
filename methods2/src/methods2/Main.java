package methods2;

public class Main {

	public static void main(String[] args) {
		String  mesaj="bugün hava yaðmurlu";
		String yeniMesaj=mesaj.substring(2,3);
		System.out.println(yeniMesaj);
		 
		int sayi=topla(25,60);
		System.out.println(sayi);
		int topla=topla2(2,3,4,5,5);
		System.out.println(topla );
		
		String sehir=sehirVer();
	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int...sayilar) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
    public static String sehirVer() {
		return "ankara";
	}

}
