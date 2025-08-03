public class Main
{
	public static void main(String[] args) {
	// Klavyeden n sayısı giriliyor. Klavyeden girilen n sayısı kadar diziyi bir öne kaydıran ve ilk elemanı sona atayan program.
    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int n,i,size,temp,k;
	size = 10;
	System.out.print("n: ");
	n = kb.nextInt();
	for (k=1; k <= n % size; k= k+1 ) {
	    temp = a[0];
	    for(i=1; i<size; i =i +1) 
	        a[i-1] = a[i];
	        
	 a[size-1] = temp;
	}
	
	for(i = 0; i < size; i = i +1)
	    System.out.print(a[i] + " ");
        
	}
}
