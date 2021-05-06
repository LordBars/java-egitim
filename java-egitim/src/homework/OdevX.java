package homework;

public class OdevX {
	
	
	public static void main (String [] args) {
		System.out.println(isPrime(3));
		
		{
			int b = 4;
		}
	}
	
/*	static boolean isPrime(int num) {
		
		if (num <= 1) {
			return false;
		}
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	} */
	
	static boolean isPrime(int num) {
		if (num <= 2) {
			return num == 2; // sayı 2'ye eşitse true, değilse false 
		}
		
		return isPrime(num, 2);
	}
	
	static boolean isPrime(int num, int i) {
		
	//	if (num == i) {
//			return true;
//		}
		
		if (num % i == 0) {
			return false;
		}
		
		if (i * i > num) {
			return true;
			// Karekökünden küçük hiçbir sayıya bölünemeyen sayılar asaldır, 16 = 8 . 2, 16 . 1, 4. 4  
		}
	
		return isPrime(num, i + 1);
	}
	
}


