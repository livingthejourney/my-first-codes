public class Main
{
	public static void main(String[] args) {
	//klavyeden girilen 3 farklı sayının en büyüğünü bulan program.
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int x,y,z;
	System.out.print("1. sayıyı giriniz: ");
	x = kb.nextInt();
	System.out.print("2. sayıyı giriniz: ");
	y = kb.nextInt();
	System.out.print("3. sayıyı giriniz: ");
	z = kb.nextInt();
	
	if ( x > y)
	    if( x > z)
	        System.out.print(x + " sayısı en büyük ");
	    else
	        System.out.print(y + " sayısı en büyük");
	else
	    if ( y > z)
	        System.out.print(y + " sayısı en büyük");
	    else
	        System.out.print(z + " sayısı en büyük");
	        
	
    /* 
    java.util.Scanner kb = new java.util.Scanner(System.in);
	int a[] = new int[3];
	int i,max;
    ( i = 0; i < 3; i = i +1) {
    System.out.print("sayı giriniz: ");
    a[i] = kb.nextInt();
    }
    
    max = a[0];
    
    for (i = 0; i < 3; i = i +1)
    if ( a[i] > max)
        max = a[i];
        
    System.out.print(max); */
	
	}
}
