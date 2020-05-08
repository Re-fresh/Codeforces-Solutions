import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class P_1154A {

	public static void main(String args[]) {
	Scanner inp = new Scanner(System.in);
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	ArrayList<Integer> brr = new ArrayList<Integer>();
	
	arr.add(inp.nextInt());
	arr.add(inp.nextInt());
	arr.add(inp.nextInt());
	arr.add(inp.nextInt());
	inp.close();
	
	int maxint = Collections.max(arr); 
	
//	System.out.println(arr.get(0));
//	System.out.println(maxint);
	
	for(int i=0;i<4;i++) {
		if(arr.get(i) != maxint)
			brr.add(arr.get(i));}
	
	int a = brr.get(0) + brr.get(1) - maxint;
	int b = brr.get(1) + brr.get(2) - maxint;
	int c = brr.get(2) + brr.get(0) - maxint;
	
	System.out.println(a + " " + b + " " + c);
		
	}
	
	
}

