public class Main
{
	public static void main(String[] args) {
    // Klavyeden girilen sayıdan küçük ve tek olan dizi elemanlarını ekrana yazdıran program.
    
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,size;
    size = 10;
    
    System.out.print("n: ");
    n = kb.nextInt();
    for (i = 0; i < size; i = i +1 )
        if (a[i] < n)
            if (a[i] % 2 != 0)
                System.out.print(a[i] + " ");
            
	}
}
