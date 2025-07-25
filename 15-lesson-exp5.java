public class Main
{
	public static void main(String[] args) {
	int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	
    // Dizinin son n adet elemanınını baştan sona doğru yazdıran program.
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i,size,n;
    size = 10;
    System.out.print("n: ");
    n = kb.nextInt();
    for(i= size-n; i< size; i = i + 1)
        System.out.print(a[i] + " ");
	}
}
