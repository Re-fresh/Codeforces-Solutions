import java.util.Scanner;

public class P_791A {	
	public static void main(String args[]) {
		
		Scanner inp = new Scanner(System.in);
		
		int a = inp.nextInt();
		int b = inp.nextInt();
		int y;
		
		for(y=1; ;y++) {
			a *= 3;
			b *= 2;	
			
			if(a>b){System.out.println(y); break;}
			}
		inp.close();	
	}
}
