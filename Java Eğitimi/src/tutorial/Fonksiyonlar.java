package tutorial;
/**
 * Fonksiyonlar
 * @author Duha Bars Okutan
*/

public class Fonksiyonlar {
		
	public static void main(String [] args) {
		
		System.out.println(f(-2));
		
		String mesaj = mesajVer();
		System.out.println(mesaj);
		
		println("Evet"); 
		
		// Narrowing Casting, Manuel, büyük -> küçük, int - short
		sayiYazdir( (short) 12); 
		
		// Widening Casting, Otomatik, küçük -> büyük (int - long)
		sayiYazdir1(5);
		
	}
	
	static int f(int x) {
		return g(x);
	}
	
	
	// g(x) = x + 2, xeZ
	static int g(int x) {
		return x + 2;
	}
	
	static String mesajVer() {
		return "Merhaba, Verdim";
	}
	
	static void println(String mes) {
		System.out.println(mes);
	}
	
	static void sayiYazdir(short sayi) { 
		System.out.println(sayi);
	}
	
	static void sayiYazdir1(long sayi) { 
		System.out.println(sayi);
	}
}
