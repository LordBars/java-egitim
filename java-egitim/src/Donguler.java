/**
 * Döngüler
 * @author Duha Bars Okutan
 */
public class Donguler {
	public static void main(String[] args) {
		
		// for, while, do-while, for-each
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Merhaba for " + i);
		}
		
		int i = 0;
		while (i > 0) {
			System.out.println("Merhaba while " + i);
			i--;
		}
		
		int j = 0;
		do {
			System.out.println("Merhaba do-while " + j);
			j--;
		} while (j > 0);
		
		String [] arr = {"Elma", "Armut", "Kiraz"};
		
		for (String eleman: arr) {
			System.out.println(eleman);
		}
	}
}
