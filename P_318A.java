import java.util.Scanner;
import java.util.Vector;

public class P_318A {

	public static void main(String[] args) {
	
		Scanner inp = new Scanner(System.in);
		long n = inp.nextLong();
		long k = inp.nextLong();
		inp.close();
		
		ArrayList<Long> arr = new ArrayList<Long>();		
		
		for(long i=1; i<=n;i+=2) arr.add(i);
		for(long i=2; i<=n;i+=2) arr.add(i);
		
		System.out.println(arr);
		
		
	
	}
}
