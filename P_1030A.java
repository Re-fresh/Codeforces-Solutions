import java.util.Scanner;

public class P_1030A {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int flag =0;
		int n = inp.nextInt();
		inp.nextLine();
		
		for(int i=0; i<n; ++i) {
			if(inp.nextInt() == 1) {
				System.out.println("HARD");	
				flag =1;
				break;
			}}
			if(flag==0)
				System.out.println("EASY");
			
		inp.close();
	}	
}
