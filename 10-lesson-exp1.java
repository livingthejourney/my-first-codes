public class Main
{
	public static void main(String[] args) {
	// Klavyeden girilen 3 kenar uzunluğunun bir ikizkenar üçgen oluşturup oluşturmadığını ekrana yazdıran program.(girilen kenar uzunluklarının bir üçgen oluşturdugu kabul ediliyor ve eşkenar üçgen ikizkenar üçgen kabul edilmeyecek. )
		
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a,b,c;
	
	System.out.print("a : ");
	a = kb.nextInt();
	System.out.print("b : ");
	b = kb.nextInt();
	System.out.print("c : ");
	c = kb.nextInt();
	
	if ( a == b )
	    if ( a != c)
	        System.out.print("ikizkenar");
	    else
	        System.out.print("ikizkenar değil");
	else
	    if ( a == c)
	        System.out.print("ikizkenar");
	    else
	        if ( b == c)
	            System.out.print("ikizkenar");
	        else
	            System.out.print("ikizkenar değil");
	            
	
	}
}
