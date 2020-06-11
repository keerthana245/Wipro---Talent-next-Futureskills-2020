1. public class Minmax {
         public static void main(String[] args) {
		System.out.println("Integer range:");
		System.out.println("min: " + Integer.MIN_VALUE);
		System.out.println("max: " + Integer.MAX_VALUE);
		System.out.println("Double range:");
		System.out.println("min: " + Double.MIN_VALUE);
		System.out.println("max: " + Double.MAX_VALUE);
		System.out.println("Long range:");
		System.out.println("min: " + Long.MIN_VALUE);
		System.out.println("max: " + Long.MAX_VALUE);
		System.out.println("Short range:");
		System.out.println("min: " + Short.MIN_VALUE);
		System.out.println("max: " + Short.MAX_VALUE);
                         System.out.println("Byte range:");
		System.out.println("min: " + Byte.MIN_VALUE);
		System.out.println("max: " + Byte.MAX_VALUE);
                          System.out.println("Float range:");
		System.out.println("min: " + Float.MIN_VALUE);
                          System.out.println("max: " + Float.MAX_VALUE);
	}
}
2.public class program2 {
public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println("Given Number: " + num);		
		System.out.println("Binary equivalent: " + Integer.toBinaryString(num));
		System.out.println("Octal equivalent: " + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent: " + Integer.toHexString(num));
	}
}
3.public class program3 {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		String output = String.format("%8s", Integer.toBinaryString(input)).replace(' ', '0');
		System.out.println(output);
		sc.close();
	}
}
4.class Employee implements Cloneable {
	private String name;
	public Employee(String name) {
		this.name = name;
	}	
public Employee(Employee emp) {
		this.name = emp.name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}
 public class Employee {
	public static void main(String[] args) {
		Employee emp = new Employee("Bob Biswas");
		Employee empClone = emp.clone();
		empClone.setName("John Doe");	
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}
}
