import java.util.Scanner;

public class GreaterOfTheTwo {

	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else if(b>a) {
			System.out.println(b+" is greater than "+a);
		}
		else {
			System.out.println(a+" is equal to "+b);
		}
		s.close();
	}
}
