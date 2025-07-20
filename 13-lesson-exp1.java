public class Main
{
	public static void main(String[] args) {
    //10'dan 90'a kadar 4'er 4'er artarak giden fahrenheit cinsinden sıcaklık değerlerinin celsuis karşılıklarını ekrana yazdıran program.
    
    double f,c;
    
    for (f = 10; f <= 90; f = f + 4) {
        c = 5.0 / 9 * (f -32);
        System.out.println("f: " + f + " c: " + c);
    }
    
	}
}
