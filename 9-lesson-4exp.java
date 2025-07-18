public class Main
{
	public static void main(String[] args) {
		// Klavyeden girilen 3 kenar uzunluğu bri üçgen oluşturup oluşturmadığını ekrana yazdıran program. Aşağıdaki 3 koşul sağlanırsa üçgendir.
		// a + b > c
		// a + c > b
		// b + c > a 
		
		
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a,b,c;
	
	System.out.print("a: ");
	a = kb.nextInt();
	
	System.out.print("b: ");
	b = kb.nextInt();
	
	System.out.print("c: ");
	c = kb.nextInt();
	
	if ( a + b > c )
	    if ( a + c > b)
	        if ( b + c > a )
	            System.out.print("üçgendir.");
	        else
	            System.out.print("üçgen değil.");
	    else 
	        System.out.print("üçgen değil.");
	else
	    System.out.print("üçgen değil.");
	
	}
}
