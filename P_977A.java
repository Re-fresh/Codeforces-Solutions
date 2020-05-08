import java.util.Scanner;

public class P_977A {

	public static void main(String[] args) {
		
	Scanner inp = new Scanner(System.in);
	
	int n = inp.nextInt();
	int k = inp.nextInt();
	inp.close();
	
	for(int i =0; i<k; ++i){
		if(n%10 ==0)
			n /= 10;
		else
			n -=1;
	}

	System.out.println(n);
		
	}

}
