package oop;

public class Main {
	public static void main(String [] args) {
		
		İşçi isci = new İşçi("Matt", 16, 10.0, 100.0);
		isci.uyu();
		isci.printStates();
	}
}


class İnsan {
	String ad;
	int yas;
	double enerji = 0.0;
	
	İnsan(String ad, int yas, double enerji) {
		this.ad = ad;
		this.yas = yas;
		this.enerji = enerji;
	}
	
	void yemekYe() {
		enerji += 1;
	}
	
	void uyu() {
		enerji += 5;
		System.out.println("İnsan KALK!");
	}
	
	void doğumGünüKutla() {
		yas++;
	}
}

class İşçi extends İnsan {
	
	double maas;
	
	İşçi(String ad, int yas, double enerji, double maas) {
		super(ad, yas, enerji);
		this.maas = maas;
	}
	
	void terfiAl(int maas) {
		this.maas += maas;
	}
	
	void uyu() {
		super.uyu();
		System.out.println("İşçi işin var, KALK!!!");
	}
	
	void printStates() {
		System.out.println("ad: " + super.ad + ", yas: " + super.yas + ", enerji: " + super.enerji 
				+ "maaş: " + this.maas);
	}
	
}
