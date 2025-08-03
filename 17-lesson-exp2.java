public class Main
{
	public static void main(String[] args) {
	// a dizisini 2. dizi yardımıyla a dizisini n defa kaydıran program. 
  int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
  int b[] = new int [10];
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int n,i,size,k;
	size = 10;
    
	System.out.print("n: ");
	n = kb.nextInt();
    
	for(i = 0; i < n; i = i + 1)
	    b[i] = a[i];
	    
	for(i= n; i<size; i =i +1) 
	    a[i-n] = a[i];
	
	for (i = 0; i < n; i = i +1)
	    a[size-n+i] = b[i];
	        
	for(i = 0; i < size; i = i +1)
	    System.out.print(a[i] + " ");
        
	}
}
