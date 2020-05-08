import java.util.Scanner;

public class P_1186A {
	
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int par = inp.nextInt();
		int pen = inp.nextInt();
		int book = inp.nextInt();
		inp.close();
		
		if(pen >= par && book >= par)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	

}
