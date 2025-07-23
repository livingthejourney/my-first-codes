public class Main
{
	public static void main(String[] args) {
    // Klavyeden x ve y değerleri giriliyor.x 'in y 'den küçük olduğu kabul ediliyor. x 'den küçük dizi elemanları ile y 'den büyük dizi elemanlarını ekrana yazdıran program.'
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int i,x,y,size;
    size = 10;
    System.out.print("x: ");
    x = kb.nextInt();
    System.out.print("y: ");
    y = kb.nextInt();
    for (i=0; i <size; i = i + 1)
    if (a[i] < x)
        System.out.print(a[i] + " ");
    else
        if (a[i] > y)
            System.out.print(a[i]+ " ");
	}
}
