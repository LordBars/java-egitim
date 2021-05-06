package tutorial;
/**
 * Ternary Operatörü
 * @author Duha Bars Okutan
 * */
public class TernaryOperator {

	public static void main(String[] args) {
		String mesaj =  "";
		
		int sayi = 4;
		
		mesaj = sayi > 10 ? "Sayı 10'dan büyük" : sayi > 5 
				? "Sayı 5 ile 10 arasında" : "Sayi 5'den küçük";
		
		System.out.println(mesaj);
	}

}
