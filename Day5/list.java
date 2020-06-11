1.import java.util.ArrayList;
public class EmployeeApplication {
	private ArrayList<Integer> list = new ArrayList<Integer>(){
	public ArrayList<Integer> saveEvenNumbers(int N) {
		list = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		return list;
	}
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();	
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}	
		return newList;
	}

	public static void main(String[] args) {
		Assignment1 asg = new Assignment1();
		asg.saveEvenNumbers(10);
		asg.printEvenNumbers();
	}
}
2.1 application for employment management
a.employment class
public class Employee {
	private int EmpId; 
	private String EmpName;
	private String EmpEmail; 
	private char EmpGender;
	private float EmpSalary;	
	public Employee() {}
	public Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpEmail = empEmail;
		EmpGender = empGender;
		EmpSalary = empSalary;
	}

public String GetEmployeeDetails() {
 return  "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpEmail=" + EmpEmail 
				+ ", EmpGender=" + EmpGender + ", EmpSalary=" + EmpSalary + "]";
	}

	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}

	public char getEmpGender() {
		return EmpGender;
	}
	public void setEmpGender(char empGender) {
		EmpGender = empGender;
	}
	public float getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(float empSalary) {
		EmpSalary = empSalary;
	}		
}
b.class employDB
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EmployeeDB {
	List<Employee> employeeDb = new ArrayList<>();
	public boolean addEmployee(Employee e) {
		return employeeDb.add(e);
	}
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		Iterator<Employee> it = employeeDb.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}	
		return isRemoved;
	}
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		for (Employee e : employeeDb) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
				e.getEmpSalary();
			}
		}
		return paySlip;
	}
	public Employee[] listAll() {
		Employee[] empArray = new Employee[employeeDb.size()];
		for (int i = 0; i < employeeDb.size(); i++)
			empArray[i] = employeeDb.get(i);
		return empArray;
	}	
}
MainTest.java:
public class MainTest {
	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		Employee emp1 = new Employee(101, "Bob", "bob@w3epic.com", 'M', 25000);
		Employee emp2 = new Employee(102, "Alice", "alice@w3epic.com", 'F', 30000);
		Employee emp3 = new Employee(103, "John", "john@w3epic.com", 'M', 20000);
		Employee emp4 = new Employee(104, "Ram", "ram@w3epic.com", 'M', 50000);
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		System.out.println();
		empDb.deleteEmployee(102);
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		System.out.println();	
		System.out.println(empDb.showPaySlip(103));
	}
}
3.import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListMethod{
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		printAll(list);
	}
	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
4.import java.util.ArrayList;
import java.util.List;
class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
public class ArrayListNumbers {
	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}
5.import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class ArrayListEmployee{
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();	
		list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));
		Iterator<Employee> it = list.iterator();
		int searchId = 102;
                  	while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}
}

6.public class Linked list{
	private LinkedList<Integer> list = new LinkedList<Integer>();
	public LinkedList<Integer> saveEvenNumbers(int N) {
		list = new LinkedList<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		return list;
	}
	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		return newList;
	}
	public static void main(String[] args) {
		Assignment1 asg = new Assignment1();
		asg.saveEvenNumbers(10);
		asg.printEvenNumbers();
		}
}
7.public class Vector{
	private Vector<Integer> list = new Vector<Integer>();
	
	public Vector<Integer> saveEvenNumbers(int N) {
		list = new Vector<Integer>();
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		return list;
	}
	public Vector<Integer> printEvenNumbers() {
		Vector<Integer> newList = new Vector<Integer>();
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}
	public static void main(String[] args) {
		Assignment1 asg = new Assignment1();
		asg.saveEvenNumbers(10);
		asg.printEvenNumbers();		
}
}
8.import java.util.Iterator;
import java.util.Vector;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class Enumeration{
	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());	
	}
}
