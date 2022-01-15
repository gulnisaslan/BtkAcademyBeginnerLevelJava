package hashMapDemo;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "kitap");
		sozluk.put("computer", "bilgisayar");
		sozluk.put("table", "masa");
		System.out.println(sozluk.size()); 
		
		for (String item : sozluk.keySet()) {
			System.out.println("Eleman-"+item +"Deðer"+sozluk.values());
		}
		
		
		
		sozluk.remove("table");
		sozluk.clear();
		
		System.out.println(sozluk.get("table"));

		
		
	}

}
