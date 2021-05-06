package tutorial;
/**
 * Veri Tipleri
 * @author Duha Bars Okutan
 */
public class VeriTipleri {
	
	public static void main(String[] args) {
		/** 
		 * İlkel Veri Tipleri:
		 * int, long, short, byte => Tam Sayı
		 * float, double => Ondalık Sayı
		 * char => Karakter ve Sayı
		 * boolean => true veya false
		 */
					
		int sayi1 = 2;
		long sayi2 = 4l;
		short sayi3 = 5;
		byte sayi4 = 11;
				
		float sayi5 = 15.0f;
		double sayi6 = 21.0;
				
		
		char c = 'A';
		boolean bool = true;
				
		/** String sınırsız karakter tutar */
		String str = "MERHABA!!!";
				
		/** var identifier:
		 * Sağ taraftaki ifadeden gelen tipi 'infer' eder
		 * Bazı kısıtlamalara sahiptir 
		*/
		var str2 = "Merhaba, Bu bir String";
	}
}
