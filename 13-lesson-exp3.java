public class Main
{
	public static void main(String[] args) {
  // Klavyeden a ve b değeri giriliyor. a'nın b 'den küçük olduğunu kabul ediliyor. a ile b 'nin arasındaki 5'in katlarını ekrana yazdıran program. a ve b dahil değil.
    
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int a,b,i;
    System.out.print("a: ");
    a = kb.nextInt();
    System.out.print("b: ");
    b = kb.nextInt();
    
    for ( i = a + 5 -(a % 5); i < b; i = i + 5)
        System.out.print(i + " ");
    
	}
}
