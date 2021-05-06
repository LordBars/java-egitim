package tutorial;
import java.util.Scanner;

/**
 * Koşullar ile not uygulaması
 * @author Duha Bars Okutan
 * */
public class KosullarUygulama {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Notunuzu giriniz: ");
		float not = sc.nextFloat();
		
		if (not < 0 || not > 100) {
			System.out.println("Notun geçersiz");
		}
		
		else if (85 <= not) {
			System.out.println("A");
		}
		
		else if (70 <= not) {
			System.out.print("B");
		}
		
		else if (50 <= not) {
			System.out.println("C");
		}
		
		else {
			System.out.println("F");
		}
		
		sc.close();
		
	}

}
