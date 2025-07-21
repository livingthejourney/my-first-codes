public class Main
{
	public static void main(String[] args) {
  //1 ile 100 sayısı arasındaki 3,4 ve 5’in katlarını ekrana iç içe yazdıran program.
    int i;
  for (i = 1; i <= 100; i = i + 1) {
    if ( i % 3 == 0)
        System.out.print(i + " ");
    if ( i % 4 == 0)
        System.out.print(i + " ");
    if ( i % 5 == 0)
        System.out.print(i + " ");
  } 
   
	}
}
