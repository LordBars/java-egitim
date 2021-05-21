package basics;
/**
 * Rekürsif Fonksiyonlar
 * @author Duha Bars Okutan*/
public class RecursiveFonksiyon_17 {

	public static void main(String[] args) {
		say1(0);
		say2(0);
	}

	/**
	 * Başlangıc sayısından 100'e kadar konsola sayı yazdırır
	 * */ 
	static int say1(int sayi) {
		
		System.out.println(sayi);
		if (sayi == 100) {
			return 0;
		}
		
		return say1(sayi + 1);
	}
	
	// void tipi ile rekürsif fonksiyon
	static void say2(int sayi) {
		
		System.out.println(sayi);
		if (sayi == 100) {
			return;
		}
		
		say2(sayi + 1);
	}
	
	// say(0) -> say(1) -> say(2) -> ..... -> say(99) -> say(100) = 0
}
