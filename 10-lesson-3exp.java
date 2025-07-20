public class Main
{
	public static void main(String[] args) {
	//klavyeden girilen 3 farklı sayının ortancasını ekrana yazdıran program.
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a,b,c;
	System.out.print("a : ");
	a = kb.nextInt();
	System.out.print("b : ");
	b = kb.nextInt();
	System.out.print("c : ");
	c = kb.nextInt();
	
	if ( a > b)
	    if ( a < c)
	        System.out.print(a);
	    else
	        if ( b > c)
	            System.out.print(b);
	        else
	            System.out.print(c);
	else
	    if (b < c)
	        System.out.print(b);
	    else
	        if ( a > c)
	            System.out.print(a);
	        else
	            System.out.print(c);
	  
	}
}
