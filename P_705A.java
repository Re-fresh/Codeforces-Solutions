import java.util.Scanner;
public class P_705A {

	public static void main(String args[]) {
		
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		inp.close();
		
		String h = "that I hate ";
		String l = "that I love ";
		
		System.out.print("I hate ");
		
		for(int i=1,j=1; i<n+1 && j<n+1 ; i+=1,j+=1) {
			if(i%2==0 && i>1)
				System.out.print(l);
			if((j+1)%2 ==0 && j>1)
				System.out.print(h);
			
		}
		System.out.println("it");
	}
}
