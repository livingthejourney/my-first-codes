public class Main
{
	public static void main(String[] args) {
	// Klavyeden s ve n giriliyor. Dizinin s nolu elemanından başlayarak n adet elemanını kendi içinde bir öne kaydıran program.
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int n,i,size,temp,s;
	size = 10;
	
	System.out.print("n: ");
	n = kb.nextInt();
	System.out.print("s: ");
	s = kb.nextInt();
	
    temp = a[s];
    
    for ( i = s + 1; i < s+n; i = i + 1)
        a[i-1] = a[i];
    
	a[s+n-1] = temp;
	
	for(i = 0; i < size; i = i +1)
	    System.out.print(a[i] + " ");
        
	}
}
