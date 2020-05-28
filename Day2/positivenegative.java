import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N;
		N=s.nextInt();
		if(N>0) {
			System.out.println("Positive");
		}
		else if(N<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		s.close();
	}

}
