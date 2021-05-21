package oop;

/**
 * Metotlar
 * printStates()
 * Overloading
 */
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yaz("merhaba");
		byte s =2;
		yaz(s);
		yaz("merhaba ", "dünya");
		
	}

	
	static void yaz(String m) {
		System.out.println(m);
	}
	
	static void yaz(String m, String m2) {
		System.out.println(m + m2);
	}
	
	static void yaz(int m) {
		System.out.println("int olan çaşışıyor");
		System.out.println(m);
	}
	
	static void yaz(byte m) {
		System.out.println("byte olan çaşışıyor");
		System.out.println(m);
	}
}

