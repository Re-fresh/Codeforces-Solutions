import java.util.Scanner;

public class P_996A {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int wd = inp.nextInt();
		inp.close();

		int flag = 0;

		int arr[] = {100, 20, 10, 5, 1};
		
		while (wd != 0) {
			for (int i = 0; i < 5; i++) {
				while(wd-arr[i]>=0) {
					wd-=arr[i]; flag+=1;
				}
			}
		}

		System.out.println(flag);

	}
}
