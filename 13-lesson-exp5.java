public class Main
{
	public static void main(String[] args) {
  //Klavyeden girilen 5 sayıyı toplayan program.
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,sum;
    sum =0;
    for ( i = 1; i < 6; i = i + 1) {
        System.out.print(i + ". sayıyı giriniz: ");
        n = kb.nextInt();
        sum = sum + n;
    }
    System.out.print(sum);
    
	}
}
