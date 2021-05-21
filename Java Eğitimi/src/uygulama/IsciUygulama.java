package uygulama;

import oop.Isci;

public class IsciUygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Isci ahmet = new Isci("Ahmet", "Reklam Hizmetleri", 3600);
		
		
		// ahmet.iseAl();
		
		Isci melisa = new Isci("Melisa", "Araştırma", 4800);
		
		// melisa.iseAl();
		melisa.departmanDegistir("Planlama");
		Isci baris = new Isci("Barış", "Üretim", 6000);
		// baris.iseAl();
		
		baris.terfi(300);
		Isci bos = new Isci();
		
		Isci.iseAl(ahmet);
		Isci.iseAl(melisa);
		Isci.iseAl(baris);
		
		ahmet.printStates();
		baris.printStates();
		melisa.printStates();
		bos.printStates();
	}

}
