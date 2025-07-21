public class Main
{
	public static void main(String[] args) {
  //Klavyeden girilen 5 sayıyı toplayan ve girilen 5 sayıyı topladıktan sonra ekrana yazdıran program.
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a[] = new int [5];
    int i,sum;
    sum =0;
    for ( i = 0; i < 5; i = i + 1) {
        System.out.print(i + ". indis nolu sayıyı giriniz: ");
        a[i] = kb.nextInt();
        sum = sum + a[i];
    }
    System.out.println("toplam: " + sum);
    
    for (i = 0; i < 5; i = i + 1)
        System.out.print(a[i] + " ");
    
	}
}
