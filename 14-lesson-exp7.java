public class Main
{
	public static void main(String[] args) {
    // Klavyeden girilen sayıdan küçük tek ve çift dizi elemanlarının toplamlarını ve adetlerini ekrana ayrı ayrı yazdıran program.
    
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,size,countOdd,countEven,sumOdd,sumEven;
    size = 10;
    sumOdd = 0;
    sumEven = 0;
    countOdd =0;
    countEven = 0;
    System.out.print("n: ");
    n = kb.nextInt();
    for (i = 0; i < size; i = i +1 )
        if (a[i] < n)
            if (a[i] % 2 != 0) {
                sumOdd = sumOdd + a[i];
                countOdd = countOdd + 1;
            }
            else {
                sumEven = sumEven + a[i];
                countEven = countEven + 1;
	         } 
	
	System.out.println("teklerin toplam: " + sumOdd + " adeti: " + countOdd);
	System.out.print("çiftlerin toplam: " + sumEven + " adeti: " + countEven);
	
	    
	}
}
