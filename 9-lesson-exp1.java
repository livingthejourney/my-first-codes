public class Main
{
	public static void main(String[] args) {
	// klavyeden girilen 0 ile 1000 arasındaki sayının basamak sayısını ekrana yazdıran program. (0dan büyük 1000den küçük olduğu kabul ediliyor. )
		
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int x;
	
	System.out.print("1 - 1000 arasında bir sayı giriniz: ");
	x = kb.nextInt();
	
	if ( x < 10)
	    System.out.print("1 basamaklı");
	else
	    if ( x < 100)
	        System.out.print("2 basamaklı");
	    else
	        System.out.print("3 basamaklı");
	        
	}
}
