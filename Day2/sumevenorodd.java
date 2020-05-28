import java.util.Scanner;

public class SumEvenOrOdd {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		a=a+b;
		if(a%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		s.close();
	}
}
