public class Main
{
	public static void main(String[] args) {
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	
    // Klavyeden s ve n değerleri giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanını ekrana yazdıran program. 

    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i,size,n,s;
    size = 10;
    System.out.print("n: ");
    n = kb.nextInt();
    System.out.print("s: ");
    s = kb.nextInt();
    for ( i = s; i < s + n; i = i+ 1)
        System.out.print(a[i] + " ");
        
	}
}
