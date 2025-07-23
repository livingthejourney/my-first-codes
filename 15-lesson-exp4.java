public class Main
{
	public static void main(String[] args) {
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    // n klavyeden girilen 1 ile 10 arasında (dahil) bir sayıdır. Dizinin ilk n adet elemanını ekrana yazdıran program.
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i,size,n;
    size = 10;
    System.out.print("n: ");
    n = kb.nextInt();
    for(i=0; i < n; i = i +1)
        System.out.print(a[i] + " ");
	}
}
