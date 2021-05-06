package tutorial;
/**
 * Operatörlerin Kullanımı
 * Not: Unary ve Ternary Operatörlerinin kullanımı bu dosyada kapsanmamaktadır
 * @author Duha Bars Okutan
 */
public class Operatorler {
	public static void main(String[] args) {
		/* Operatörler değerler üzerlerinde belli işlemler
		yapmamızı sağlayan özel sembollerdir.
		
		Çeşitleri: 
		
		 - Aritmetik: +, -, /, *, %
		 - İlişkisel: ==, != , >, <, >=, <=
		 - Mantık: ||, &&, !
		 - Atama: =, +=, -=, /=, *=, %=
		 - Bitwise: |, &, ~, ^
		 - Shifting: >>, <<, >>>
		 - Ternary: ?, :
		 - Unary: ++E, --E, E++, E--, !
		*/
		
		// Aritmetik Operatörler
		System.out.println(2 + 2); // toplama
		System.out.println(2 - 2); // çıkarma
		System.out.println(2 / 2); // bölme 
		System.out.println(2 * 2); // çarpma
		System.out.println(5 % 2); // mod alma
		
		// İlişkisel Operatörler
		System.out.println(2 == 2); // eşit mi
		System.out.println(2 != 2); // eşit değil mi
		System.out.println(2 > 2); // büyük mü
		System.out.println(2 < 2); // küçük mü
		System.out.println(2 >= 2); // büyük veya eşit mi
		System.out.println(2 <= 2); // küçük veya eşit mi
		
		// Mantık Operatörleri
		System.out.println(true || false); // 1 veya 0 == 1
		System.out.println(4 > 2 && 2 == 0); // 1 ve 0 == 0
		System.out.println(!false); // 0'ın değili == 1
		
		// Atama Operatörleri
		int a = 2;
		a += 4; // a = a + 4
		a *= 2; // a = a * 2
		a -= 1; // a = a - 1
		System.out.println(a);
		
		// Bitwise Operatörleri
		int x = 5; // 101
		int y = 6; // 110
		
		System.out.println(x | y); // Bitwise OR 111
		System.out.println(x & y); // Bitwise AND 100
		System.out.println(x ^ y); // Bitwise XOR 011
		System.out.println(~x); // Bitwise Comprehent 010
		
		// Shifting
		System.out.println(x>>2); // 001 (1)
		System.out.println(x<<2); // 10 100 (20)
		
	}
}
