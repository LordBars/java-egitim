
/**
 * Döngüleri kullanarak faktöriyel uygulaması
 * @author Duha Bars Okutan
 * */

public class DongulerUygulama {

	public static void main(String[] args) {
		
		int n = 7;
		
		int cevap = 1;
		
		// 5! = 5. 4!, 4! = 4. 3!, ... 1! = 1 . 0!
		for (int i = n; i > 0; i--) {
			cevap = cevap * i; 
		}
		
		System.out.println(cevap);
	}

}
