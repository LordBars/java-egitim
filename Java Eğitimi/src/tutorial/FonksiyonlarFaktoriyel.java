package tutorial;
/**
 * Rekürsif fonksiyonlar ile faktöriyel uygulaması
 * @author Duha Bars Okutan
 */

public class FonksiyonlarFaktoriyel {

	public static void main(String[] args) {
		
		factorial(5);
	}

	// n! = n . (n - 1)!
	static int factorial(int sayi) {
		if (sayi == 0) {
			return 1;
		}
		
		return sayi * factorial(sayi - 1);
	}
}
