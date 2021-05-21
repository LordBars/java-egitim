package basics.homework;

import java.util.Scanner;

public class AsalBulmaAlgoritmasi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        
        int sayi = scan.nextInt();
        

        System.out.println(sayi + " asal mı? " + asalMi(sayi, 2));
        
        scan.close();	
		
	}
	

	// 16 = 4 * 4
	// 16 = 8 * 2
	
	static boolean asalMi(int sayi, int i) {
		
		if (sayi <= 1) {
			return false;
		}
		
		if (i * i > sayi) { // karekökünden küçük hiçbir sayıya bölünmemiş
			return true;
		}
		
		if (sayi % i == 0) {
			return false;
		}
		
		return asalMi(sayi, i + 1);
	}
	
	
}
