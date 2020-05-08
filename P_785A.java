import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P_785A {

	public static void main(String[] args) {

		Map<String, Integer> geofig = new HashMap<>();
		geofig.put("Tetrahedron", 4);
		geofig.put("Cube", 6);
		geofig.put("Octahedron", 8);
		geofig.put("Dodecahedron", 12);
		geofig.put("Icosahedron", 20);

		Scanner inp = new Scanner(System.in);
		int N = inp.nextInt();
		inp.nextLine(); //Eat the enter key
		int sum = 0;
		int x = 0;
		while (x < N) {
			sum += geofig.get(inp.next());
			x++;
		}
		System.out.println(sum);
		inp.close();
	}

}
