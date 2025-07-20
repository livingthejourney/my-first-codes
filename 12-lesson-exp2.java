public class Main
{
	public static void main(String[] args) {
	// n klavyeden girilen pozitif bir sayıdır. 1'den n 'ye kadar olan sayıları ekrana yazdıran program.
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int i,n;
	System.out.print("n: ");
	n = kb.nextInt();
	 
	for (i = 1; i < n; i = i + 1)
	    System.out.print(i + " ");
	}
}
