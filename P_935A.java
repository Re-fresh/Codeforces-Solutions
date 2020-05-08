import java.util.Scanner;

public class P_935A {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int N = inp.nextInt();
		inp.close();
		int flag =1;

		for(int i=2; i<N; i++) {
			if(N%i==0)
				flag +=1;
		}
		System.out.println(flag);
		
		
		
		
	}

}
