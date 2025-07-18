public class Main
{
	public static void main(String[] args) {
    
//Klavyeden girilen x ' e göre ' y 'nın değerini ekrana yazdıran program. 
// y = k*x + t
// ( x < 0 k =2 ve t = 0 )
// ( 0 <= x <= 5 k = -1 ve t =10)
// (x > 5 k=3 ve t=-20) y = ? 
		
	java.util.Scanner kb = new java.util.Scanner(System.in);
	int x,k,t,y;
	
	System.out.print("x sayısını giriniz: ");
	x = kb.nextInt();
	
	if ( x < 0 ) {
	    k = 2;
	    t = 0;
	}   
	    else
	        if ( x <=5 ) {
	            k = -1;
	            t =10;
	        }
	        else {
	            k = 3;
	            t = -20;
	        }
	        
	 y = k * x + t;
	 System.out.print("y = " + y);
	 
	}
}
