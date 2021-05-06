package tutorial;
/**
 * Switch-Case-Default Yapısı
 * Girilen isme göre öğrencinin notunu print et
 * @author Duha Bars Okutan
 */
public class SwitchCase {

	public static void main(String[] args) {
		
		String isim = "Ceyda";
		
		switch (isim) {
			case "Ali": // if
				System.out.println("Ali'nin notu 85");
				break;
				
			case "Betül": // else if
				System.out.println("Betül'ün notu 73");
				break;
				
			case "Ceyda": // else if
				System.out.println("Ceyda'nın notu 90");
				break;
				
			default: // else
				System.out.println("Öğrenci bulunmamaktadır");
				break;
		}	
		
	}

}
