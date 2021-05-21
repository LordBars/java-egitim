package birinciPaket;


import ikinciPaket.Musteri;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Bilgisayar bil = new Bilgisayar();
		
		bil.seri = 100;
		
		bil.kodYaz();
		
		Musteri mus = new Musteri();
		mus.yas = 12;
		mus.ad = "Ali";
		
		System.out.println(mus.ad);
		// mus.id = 100_000;
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
	}

}
