package tutorial;
import java.util.Scanner;

/*
 * Girdi alıp konsola yazdırma örneği
 * @author Duha Bars Okutan
 */
public class GirdiAlma {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir şey girin: ");
		String input = scan.nextLine();
		
		System.out.println("Bunu yazdın: " + input);
		
		
		/* İşin bitince Hafıza sızdırmalarıdan kaçınmak 
		   için Scanner'i kapat */
		scan.close();
	}

}
