public class Main
{
	public static void main(String[] args) {
    //n klavyeden girilen pozitif bir sayıdır. n sayısı çift ise 0 'dan n 'ye kadar olan çift sayıları, tek ise 1'den n 'ye kadar olan tek sayıları ekrana yazdıran program.
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i;
    System.out.print("n: ");
    n = kb.nextInt();
    
    for ( i = n % 2; i <= n; i = i + 2)
        System.out.print(i + " ");
    
	}
}
