public class Main
{
	public static void main(String[] args) {
    // dizideki tek sayıları ve tek sayıların adetini ekrana yazdıran program.
    
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int size,i,countOdd;
    countOdd = 0;
    size = 10;
    for ( i = 0; i < size; i = i +1)
        if (a[i] % 2 != 0) {
            System.out.print(a[i] + " ");
            countOdd = countOdd + 1;
        }
    System.out.println();
    System.out.print("tek sayı adet: " + countOdd );
        
	}
}
