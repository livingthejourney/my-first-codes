public class Main
{
	public static void main(String[] args) {
	// / dizinin elemanlarının toplamını ve ortalamasını ekrana yazdıran program. ( ortalama tam sayı olacak )
	
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
    int size,i,sum, avg;
    size = 10;
    sum =0;
    for (i = 0; i < size; i = i + 1)
        sum = sum + a[i];
        
    avg = sum / size;
    
    System.out.print("toplam: " + sum + " ortalama: " + avg);
    
   
	}
}
