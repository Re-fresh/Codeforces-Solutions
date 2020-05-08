import java.util.Scanner;
import java.util.ArrayList;

public class P_1097A {
	
	public static void main(String args[]) {
		
		Scanner inp = new Scanner(System.in);
		
		String table = new String(inp.next());
		inp.nextLine();
		ArrayList<String> hand = new ArrayList<String>();
		
		hand.add(inp.next());
		hand.add(inp.next());
		hand.add(inp.next());
		hand.add(inp.next());
		hand.add(inp.next());
		inp.close();
		String flag = "NO";
		
		for(int i=0; i<5;i++) {
			if(table.charAt(0)==hand.get(i).charAt(0) || table.charAt(1)==hand.get(i).charAt(1) )
				{flag = "YES";
				break;}
			}
		System.out.println(flag);
		
	
		
		
	}
}