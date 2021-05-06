/**
 * Değişkenlerin Kullanımı ve Adlandırma Kuralları
 * @author Duha Bars Okutan
 */


public class Degiskenler {
	
	/*
	- Java statik tipli bir dildir, tipler değiştirilemez:
	 
	 int a = 5;
	 a = "Yeni veri tipi"; Hata verir, int tipine String verilemez
	 a = 2.4 Hata verir, int tipine double verilemez
	
	- Bir değişkeni <ul>tekrardan tanımlayamazsın:</ul>
	  
	 int x = 2;
	 int x = 4; // Hata verir
	 float x = 4.5f // Hata verir 
	  
	 */
	
	public static void main(String[] args) {
		int a = 4;
		int b = 11;
		a = b;
	
		// Değişken Adlandırma:  
		// Harf, sayı (başta olmadığı sürece) ve _ geçerlidir
		
		int _ğA2 = 5; // maksimum yapabileceğin
		
		System.out.println(a);
	}
}
