public class Main
{
	public static void main(String[] args) {
	// dizinin elemanlarının toplamını ekrana yazdıran program.
	
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int i,sum;
    sum =0;
    for (i = 0; i < 10; i = i + 1)
        sum = sum + a[i];
        
    System.out.print(sum);
   
	}
}
