package tutorial;
/**
 * <code>break</code> & <code>continue</code> komutları
 * @author Duha Bars Okutan
 */
public class BreakVeContinue {
	
	public static void main (String [] args) {
		
		// break -> döngüyü sonlandırma
		// continue -> mevcut adımı (iterasyon) atlama
		
		for (int i = 0; i < 20; i++) {
			
			if (i == 15) {
				break; // 15 ve sonrası bastırılmayacak
			}
			
			if (i == 12) {
				continue; // 12 bastırılmayacak
			}
			
			System.out.println(i);
		}
		// Çıktı: 1 2 3 4 5 6 7 8 9 10 11 13 14 
	}

}
