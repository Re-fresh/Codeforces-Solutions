import java.util.Scanner;

public class P_122A {

	public static void main(String[] args) {

		int lucky[] = { 4, 7, 47, 74, 444, 447, 474, 477, 744, 747, 774, 777 };

		Scanner in = new Scanner(System.in);
		int nub = in.nextInt();
		in.close();
		int flag=0;

		for (int i = 0; i < lucky.length; i++) {
			if (nub % lucky[i] == 0) {
				System.out.println("YES");
				flag=1;
				break;} }
		if(flag==0)
			System.out.println("NO");
		}
	}

