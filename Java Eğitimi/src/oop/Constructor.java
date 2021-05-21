package oop;

// Constructor (Yapıcı) Metot
public class Constructor {
	
	public static void main(String [] args) {
			
		Ogrenci o1 = new Ogrenci();
		System.out.println(o1.yas);
	}
	
}

/**
 * Öğrenci Sınıfı:
 * Attributes(Özellikler): Yaş, Not, Para, isim
 * Behaviour (Davranışlar): Doğum günü kutla, ders çalış, burs kazan, döner ye
 */
/* class Ogrenci {
	
	String isim;
	int yas;
	double not;
	long para;
	
	
	
	Ogrenci(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}
	

	Ogrenci(String isim) {
		this.isim = isim;
	}

	
	void dogumGunuKutla() {
		System.out.println("Doğum günü kutlanıyor...");
		yas++;
	}
	
	void dersCalis() {
		System.out.println("Ders çalışılıyor...");
		not += 10;
	}
	
	void bursAl(int burs) {
		System.out.println("Burs alındı.");
		para += burs;
	}
	
	void donerYe() {
		System.out.println("Döner yeniyor...");
		para -= 10;
	}
} */
