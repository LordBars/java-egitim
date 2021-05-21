package basics.homework;

import java.util.Scanner;

public class SayiGirdiAlma_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		float sayi = sc.nextFloat();
		sayi+=2; // sayi = sayi + 2
		sayi /= 8; // sayi = sayi / 8
		System.out.println(sayi);
		
	}
	
	
}
