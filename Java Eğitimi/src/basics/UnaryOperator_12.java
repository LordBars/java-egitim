package basics;
/**
 * Ders 12: Unary Operatörleri
 * @author Duha Bars Okutan
 */
public class UnaryOperator_12 {

	public static void main(String[] args) {
		/** Unary Operatörleri:
		* E (expression)
		* Negotation: -E 
		* prefix increment (önce arttırma) -> ++E
		* postfix increment (sonra arttırma) -> E++
		* prefix decrement (önce azaltma) -> --E
		* postfix decrement (sonra azaltma) -> E--
		* !E 
		*/
		
		int a1 = 2;
		System.out.println("post inc: " + (a1++));
		System.out.println("post inc: " + a1);
		
		int a2 = 2;
		System.out.println("pre inc: " + (++a2));
		System.out.println("pre inc: " + a2);
		
		int a3 = 2;
		System.out.println("post dec: " + (a3--));
		System.out.println("post dec: " + a3);
		
		int a4 = 2;
		System.out.println("pre dec: " + (--a4));
		System.out.println("pre dec: " + a4);
		
		System.out.println(!(2 > 4));
		System.out.println(!true);
		
		int a5 = 2;
		System.out.println("negotation: " + -a5);
	}

}
