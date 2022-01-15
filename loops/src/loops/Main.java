package loops;

public class Main {

	public static void main(String[] args) {
	int number=10;
    //for
	for (int i = 0; i < number; i++) {
		System.out.println(i); 
		
	}
	System.out.println("For Döngüsü bitti");
	
	//while
	int i= 1;
	while (i<10){
		
		System.out.println(i);
		i++;
	}
	System.out.println("While Döngüsü bitti");
	//Do while
	int j=10;
	do {
	  System.out.println(j);
	  i+=2;
	} while (j<10);
	System.out.println("Do-While Döngüsü bitti");
	
  }

}
