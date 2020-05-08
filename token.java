import java.util.StringTokenizer;

public class token {
	public static void main(String[] args) {
		
		StringTokenizer stt = new StringTokenizer("My name is USER \n This is new line");
		int i =0;
		int j = stt.countTokens();
		while(stt.hasMoreTokens()) {
			System.out.println("Token " + i+ ":" + stt.nextToken("\n"));
			i++;
		}
		System.out.println("Initial Tokens Count:"+ j + "\nCurrent Tokens Count:" + stt.countTokens());
		
	}

}
