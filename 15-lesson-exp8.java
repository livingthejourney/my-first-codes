public class Main
{
	public static void main(String[] args) {
	// Dizinin ilk n adet elemanını dizinin sonuna ekleyen(atayan) ve baştaki elemanları sıfırlayan program
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int n,i,size;
	size = 10;
	System.out.print("n: ");
	n = kb.nextInt();
    for (i=0; i < n; i= i + 1)
        a[size-1-i]= a[n-1-i];
        
    for(i =0; i < size-n; i = i +1)
        a[i] = 0;
        
    for( i = 0; i < size; i = i + 1)
        System.out.print(a[i] + " ");
	
	}
}
