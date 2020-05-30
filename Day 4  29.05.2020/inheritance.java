ANIMAL,BIRD:

class Animal
{
  public  Animal()
  {
    System.out.println("A");
  } 
  void eat()
  {
    System.out.println("EAT");
  }
  void sleep()
  {
    System.out.println("SLEEP");
  }
}
class Bird extends Animal
{
    public Bird()
    {
      System.out.println("B");
    }
    @Override
  
    void eat()
  {
    System.out.println("B.EAT");
  }
  void sleep()
  { 
    System.out.println("B.SLEEP");
  }
    void fly()
    {
      System.out.println("B.FLY");
    }

}
class Animal1
{
  public static void main(String args[])
  {
    Animal a=new Animal();
    Bird b= new Bird();
    a.eat();
    a.sleep();
    b.eat();
    b.sleep();
    b.fly();
  }
}

2)PERSON,EMPLOYEE,TESTEMPLOYEE:

public class Person{
    
        String name;
        public Person(String ne)
        {
           public void setName(String)
            {
                name=ne;
            }
            public String getName()
            {
                return name;
            }
            public String toString()
            {
                return name;
            }
    }
}
class Employee extends Person{
    super(ne);
        double annual_salary;
        int start_year;
        String national_no;
    public Employee(String ne,double a,int yr,String n)
    { 
        void setSalary(double){
            annual_salary=a;
        }
        void setYear(int){
            start_year=yr;
        }
        void setNumber(String){
            national_no=n;
        }
        public double getSalary(){
            return annual_salary;
        }
        public int getYear(){
            return start_year;
        }
        public double getNumber(){
            return natonal_no;
        }
        public String toString()
        {
            return super.toString()+""+annual_salary+""+start_year+""national_no;
        }
}
class TestEmployee{
    Person p =new Person("Bob");
    Employee e= new Employee("Alice","25000","2018","qwer");
    System.out.println(p);
    System.out.println(e);
}

3)TEACHER:

public class Person
{
 public String myName ; 
 public int myAge; 
 public String myGender; 
 
 	public Person(String name, int age, String gender)
	{
 	myName = name;
	 myAge = age;
 	myGender = gender;
	 }

 	public String getName()
	{
 		return myName;
 	}

	public int getAge()
	{
 		return myAge;
	 }
	 public String getGender()
	{
	 return myGender;
	 }
	 public void setName(String name)
	{
 	myName = name;
 	}
	 public void setAge(int age)
	{
	 myAge = age;
 	}
	 public void setGender(String gender)
	{
	 myGender = gender;
 	}
 	public String toString()
	{
 	return myName + ", age: " + myAge + ", gender: " +myGender;
	}
}
public class Student extends Person
{
public String myIdNum; 
public double myGPA; 

public Student(String name, int age, String gender,String idNum, double gpa)
{

	super(name, age, gender);

	myIdNum = idNum;
	myGPA = gpa;
}
public String getIdNum()
{
return myIdNum;
}
public double getGPA(){
return myGPA;
 }
public void setIdNum(String idNum)
{
myIdNum = idNum;
}
public void setGPA(double gpa)
{
myGPA = gpa;
}

public String toString()
{
return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
}
}
