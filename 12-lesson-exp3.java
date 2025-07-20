public class Main
{
	public static void main(String[] args) {
	// klavyeden a ve b giriliyor. a 'nın b 'den küçük girildiği kabul ediliyor.(a < b) a 'dan b ye kadar olan sayıları ekrana yazdıran program.
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int a,b,i;
	System.out.print("a: ");
	a = kb.nextInt();
	System.out.print("b: ");
	b = kb.nextInt();
	
	for (i= a; i <= b; i = i + 1)
	    System.out.print(i + " ");
	    
	}
}
