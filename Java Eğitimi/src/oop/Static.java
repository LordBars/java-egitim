package oop;


public class Static {
	public static void main(String [] args) {
		
		Kisi kisi = new Kisi();
		
		Kisi.populasyon = 200;
		Kisi.nufusArtir(50);
		
		kisi.isim = "Ali";
		
		Kisi kisi2 = new Kisi();
		kisi2.isim = "Betül";
		
		System.out.println(kisi.isim);
		System.out.println(kisi2.isim);
		
		kisi.dogur();
		
		System.out.println(kisi.populasyon);
		System.out.println(kisi2.populasyon);
		System.out.println(Kisi.populasyon);
		
		new Static().calistir();
		
		staticCalistir();
	}
	
	void calistir() {
		
	}
	
	static void staticCalistir() {
		
	}
}



class Kisi {
	
	static long populasyon = 100;
	
	int yas;
	String isim;
	
	void dogur() {
		populasyon++;
	}
	
	static void nufusArtir(int sayi) {
		populasyon += sayi;
		// yas = 2; ==> statik alan non-statik alana erişemez 
	}
}



