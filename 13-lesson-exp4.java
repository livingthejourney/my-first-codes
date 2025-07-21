public class Main
{
	public static void main(String[] args) {
  //n klavyeden girilen pozitif bir sayıdır. 1'den n'ye kadar olan sayıların toplamını ekrana yazdıran program.( Gauss yöntemi ile yapılmayacak!)
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int n,i,sum;
    System.out.print("n: ");
    n = kb.nextInt();
    sum = 0;
    for ( i = 1; i <= n; i = i + 1 )
        sum = sum + i;
        
        System.out.print(sum);
    
	}
}
