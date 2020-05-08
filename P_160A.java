import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P_160A {
	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int N = inp.nextInt();
		int sum = 0;
		inp.nextLine();
		ArrayList<Integer> a1 = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			a1.add(inp.nextInt());
			sum += a1.get(i);
		}
		inp.close();
		
		//Sorting
		Collections.sort(a1);
		Collections.reverse(a1);
		
		int sum2 = 0;

		ArrayList<Integer> a2 = new ArrayList<>();
		for (int j = 0; j < N; j++) {
			if (sum2 <= (sum / 2)) {
				a2.add(a1.get(j));
				sum2+=a1.get(j);}
			else {break;}
		}
		System.out.println(a2.size());

	}
}
