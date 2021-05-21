package basics;

/**
 * Ders 19: Expression, Statement, Block Kavramları
 * @author Duha Bars Okutan
 */
public class ExpressionStatementBlock_19 {
	
	/**
	 * Expression: Değişkenler, atamalar, metot çalıştırmalar, 
	 * operatörler gibi işlemler expression'ları oluştururlar
	 * Sonlarına ; konulmaz
	 * 
	 * Örnekler: Değişken atama, Ternary Operatörü, 
	 * 
	 * Statement: İşlemin bitirildiğini derleyiciye söyler
	 * Sonuna ; ya da {} konulması zorunludur!
	 * 
	 * Örnekler: for, while, do-while; if-else, switch-case; değişken tanımlama
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Expression Statement
		
		int a = 2;
		
		a += 2;
	
		a++;
		
		metot(a);
		
	//	new Scanner(System.in);
		
		// Decleration Statement
		
		double d = 4.2;
		
		// Control-flow statement
		
		/* int a = 4;
		
		if (a == 4) {
			
			
		} else {
			
		}
		
		while (a > 2) {
			
		} */
		
		// Block ve Scope
		
		
		{
			System.out.println("A2");
			
			{
				{
					int b = 4;
					{
						System.out.println(b);
					}
				}
			}
		}
	}

	static void metot(Object obj) {
		
	}
}
