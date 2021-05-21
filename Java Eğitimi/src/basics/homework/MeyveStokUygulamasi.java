package basics.homework;

import java.util.Scanner;

public class MeyveStokUygulamasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Meyve giriniz: ");
		
		String meyve = sc.nextLine();
		
		switch (meyve) {
			case "armut": 
				System.out.println("Stokta 5 armut var");
				break;
				
			case "elma":
				System.out.println("Stokta 4 elma var");
				break;
				
			case "muz":
				System.out.println("Stokta 1 muz var");
				break;
				
			default:
				System.out.println("Stokta " + meyve + " yok.");
				break;
		}
		
		sc.close();
	}

}
