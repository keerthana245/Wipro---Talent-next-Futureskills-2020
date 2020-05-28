import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		s.close();
	}
}
