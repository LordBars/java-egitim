
public class JavaOOP1 {
	public static void main(String [] args) {
		Kisi kisi = new Kisi();
		
		kisi.dogumGunuKutla();
		System.out.println(kisi.yas);
		
		kisi.maasAl(100);
		System.out.println(kisi.para);
		
		kisi.isimDegistir("Ali");
		kisi.paraHarca(50);
		
		kisi.printState();
		

	}
}

class Kisi {
	String isim = "Bilinmiyor";
	int yas = 0;
	long para = 100;
	
	void isimDegistir(String yeni) {
		isim = yeni;
	}
	
	void dogumGunuKutla() {
		System.out.println("Doğum günü kutlanıyor...");
		yas++;
	}
	
	void maasAl(int maas ) {
		para += maas;
	}
	
	void paraHarca(int neKadar) {
		para -= neKadar;
	}
	
	void printState() {
		System.out.println("isim: " + isim + ", yas: " 
				+ yas + ", para: " + para);
	}
}
