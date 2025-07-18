public class Main
{
	public static void main(String[] args) {
	// klavyeden girilen 3 kenar uzunluğu bir eşkenar üçgen oluşturup oluşturmadığını ekrana yazdıran program. ( girilen kenar uzunluklarının bir üçgen oluşturdugunu kabul ediyoruz. ) 
		
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a,b,c;
	
	System.out.print("a: ");
	a = kb.nextInt();
	
	System.out.print("b: ");
	b = kb.nextInt();
	
	System.out.print("c: ");
	c = kb.nextInt();
	
	if ( a == b)
	    if ( b == c)
	        System.out.print("eşkenar");
	    else
	        System.out.print("eşkenar değil.");
	else
	    System.out.print("eşkenar değil.");

	}
}
