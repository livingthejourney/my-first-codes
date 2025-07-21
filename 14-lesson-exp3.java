public class Main
{
	public static void main(String[] args) {
	// dizideki tek sayıları ekrana yazdıran program. 
	
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int size,i;
    size = 10;
    
    for (i = 0; i < size; i = i + 1)
       if (a[i] % 2 != 0)
            System.out.print( a[i] +" ");

	}
}
