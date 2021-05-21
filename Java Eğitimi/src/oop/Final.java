package oop;

import java.util.Random;

/**
 * final keyword:
 * - class
 * - metotlar
 * - Referans değişkenleri (local) / Field'ları (Field)
 * - blank final
 * */

public class Final {
	
	public static void main(String[] args) {
		
/*		Kure kure = new Kure(1.0, new Pozisyon());
		kure.cap = 2.0;
		kure.poz.x = 4.0; */
		
		
		final int x;
		if (new Random().nextBoolean()) {
			x = 5;
		} else {
			x = 4;
		}	
		
		x = 6;
		
		System.out.println(x);
	}	

}


class Kure {
		
	final double cap;
	final Pozisyon poz;
	
	Kure(double cap, Pozisyon poz) {
		this.cap = cap;
		this.poz = poz;
	}
	
}



















class Pozisyon {
	final double x;
	/* final */ double y;
	/* final */ double z;
	
	Pozisyon() {this(0.0,0.0,0.0);}
	
	Pozisyon(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}