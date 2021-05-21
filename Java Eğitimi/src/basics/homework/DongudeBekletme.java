package basics.homework;

import java.util.Scanner;

public class DongudeBekletme {

	public static void main(String[] args) {
		
		
		
		String SIFRE = "1234";
		Scanner sc = new Scanner(System.in);
		
		while (2 > 1) {
			
			System.out.print("Şifre giriniz: ");
			String sifre = sc.nextLine();
			
			if (sifre.equals(SIFRE)) {
				System.out.println("Doğru şifreyi girdin");
				break;
			} 
			
			System.out.println("Yanlış şifreyi girdiniz");
			
			
			
		}
		
		sc.close();
		
	}

}
