package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harfler = 'r';
		switch (harfler) {
		case 'a':
		case '�':
		case 'o':
		case 'u':
			System.out.println("Kal�n sesli harfler");
			break;
		case 'e':
		case 'i':
		case '�':
		case '�':
			System.out.println("�nce sesli harfler");
			break;

		default:
			System.out.println("girilen harf sesli harf de�ildir.");
			break;
		}

	}

}
