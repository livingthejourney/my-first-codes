public class Main
{
	public static void main(String[] args) {
	/* klavyeden girilen notun harf karşılığını ekrana yazdıran program. Klavyeden girilen değerin 0-100 arasında bir değer olduğu varsayılıyor.
	80 < n <= 100 (A)
	60 < n <= 80 (B)
	40 < n <= 60 (C)
	20 < n <= 40 (D)
	0 <= n <= 20 (E)
	*/
	
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int n;
	System.out.print("Not giriniz: ");
	n = kb.nextInt();
	
	if (n > 80)
	    System.out.print("A");
	else if ( n > 60)
	    System.out.print("B");
	else if (n > 40)
	    System.out.print("C");
	else if (n > 20)
	    System.out.print("D");
	else
	    System.out.print("E");
	}
}
