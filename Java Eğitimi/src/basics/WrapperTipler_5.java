package basics;
/**
 * Ders 5: Sarmalayıcı (Wrapper) Tipler
 * @author Duha Bars Okutan*/
public class WrapperTipler_5 {
	public static void main(String[] args) {
		
		/**
		 * Tüm ilkel veri tiplerinin aynı zamanda bir 
		 * sarmalayıcı tipi vardır:
		 * int: Integer, long: Long, short: Short, byte: Byte
		 * float: Float, double: Double
		 * boolean: Boolean, char: Char
		 * 
		 * Bunlar üzerlerinde fonksiyon (metot) çalıştırabilirler
		 */
		
		Integer benimSayim = 12;
		String yeniSayi = benimSayim.toString();
		System.out.println(yeniSayi);
	}
}
