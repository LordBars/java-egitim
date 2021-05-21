package oop;


/**
 * Bu Dosya İçermektedir:
 * Class Tanımlama
 * Field Nedir?
 * Nesne Oluşturma
 * Field erişimi
 * Field'ları initialize etme
 * Varsayılan Field Değerleri
 * 
 * @author Duha Bars Okutan
 */


public class ClassVeObject {
	public static void main(String [] args) {
		
		// int class = 5;
		
		Ogrenci o1 = new Ogrenci();
		
		o1.yas = 16;
		o1.not = 100;
		
		System.out.println(null.charAt(2));
		System.out.println(o1.yas);
		System.out.println(o1.para);
		System.out.println(o1.not);
	}
}

/**
 * Öğrenci Sınıfı:
 * Attributes(Özellikler): Yaş, Not, Para, isim
 * Behaviour (Davranışlar): Doğum günü kutla, ders çalış, burs kazan, döner ye
 */


class Ogrenci {
	
	String isim;
	int yas;
	long para;
	double not;
	
}


