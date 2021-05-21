package basics.homework;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n = 6; // 5.terimde hangi fibonacci sayısı var?
		
		// 1 1 2 3 5 8 13
		
		// K | B | CVP
		// 1 + 1 = 2
		// 1 + 2 = 3
		// 2 + 3 = 5
		// 3 + 5 = 8
		// f(0) = 0
		// f(1) = f(2) = 1
		
		int cvp = 0; 
		
		int k = 1;
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			
			k = b;
			b = cvp;
			
			cvp = b + k;
			
			System.out.println("k: " + k);
			System.out.println("b: " + b);
			System.out.println("cvp: " + cvp);
		}
		
		System.out.println("CEVAP: " + cvp);
	}

}
