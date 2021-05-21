package basics;
/**
 * Ders 4: Casting (Tip Dönüştürme) Kavramı
 * @author Duha Bars Okutan
 */
public class TypeCasting_4 {
	public static void main(String[] args) {
		
		int x = 4;
		double y = x; // Widening Casting (Otomatik), küçükten büyüğe
				
		System.out.println(y);
				
		int z = (int) y; // Narrowing Casting (Manuel), büyükten küçüğe
		System.out.println(z);
		
	}
}
