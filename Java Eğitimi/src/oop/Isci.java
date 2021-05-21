package oop;

public class Isci {
	
	public String ad;
	public String departman;
	public double maas = 2_600;
	
	static int sayi;
	
	public Isci(String ad, String departman, double maas) {
		this.ad = ad;
		this.departman = departman;
		this.maas = maas;
	}
	
	public Isci() {
		/* ad = departman = "Bilinmiyor";
		maas = -1; */
		this("Bilinmiyor", "Bilinmiyor", -1);
	}
	
	public void departmanDegistir(String departman) {
		System.out.println("Departman değiştiriliyor...");
		this.departman = departman;
	}
	
	public void terfi(double miktar) {
		maas += miktar;
	}
	
	/* public void iseAl() {
		System.out.println(this.ad + " işe alınıyor.");
		sayi++;
	} */
	
	public static void iseAl(Isci isci) {
		System.out.println(isci.ad + " işe alınıyor.");
		sayi++;
	}
	
	public void printStates() {
		System.out.println("ad: " + ad + ", departman: " + departman + ", maas: " + maas
				+ ", sayi: " + sayi);
	}
}
