package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harfler = 'r';
		switch (harfler) {
		case 'a':
		case 'ý':
		case 'o':
		case 'u':
			System.out.println("Kalýn sesli harfler");
			break;
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("Ýnce sesli harfler");
			break;

		default:
			System.out.println("girilen harf sesli harf deðildir.");
			break;
		}

	}

}
