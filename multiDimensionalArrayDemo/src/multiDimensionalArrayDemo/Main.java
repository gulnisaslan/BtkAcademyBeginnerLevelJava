package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[] [] cities = new String[3][3];
		cities[0][0]="�stanbul";
		cities[0][1]="Bursa";
		cities[0][2]="Bal�kesir";
		cities[1][0]="Ankara";
		cities[1][1]="Konya";
		cities[1][2]="Kayseri";
		cities[2][0]="Gaziantep";
		cities[2][1]="�anl�Urfa";
		cities[2][2]="D�yarbak�r";
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("---------------");
			for (int j = 0; j <=2; j++) {
				System.out.println(cities[i][j]);
			}
		}

}
}
