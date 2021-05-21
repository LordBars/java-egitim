package basics;
/**
 * Ders 10: Ternary Operatörü
 * @author Duha Bars Okutan
 * */
public class TernaryOperator_10 {

	public static void main(String[] args) {
		String mesaj =  "";
		
		int sayi = 4;
		
		mesaj = sayi > 10 ? "Sayı 10'dan büyük" : sayi > 5 
				? "Sayı 5 ile 10 arasında" : "Sayi 5'den küçük";
		
		System.out.println(mesaj);
	}

}
