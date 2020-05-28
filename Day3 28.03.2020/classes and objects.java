1.BOX:
 public class Box {
    double h,w,d;
Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { double v;
    v=h*w*d;
    return v;
    }
   public static void main(String[] args) {
    Box bc = new Box(8.5,80.3,9.6);
    System.out.println(bc.volume());
  }
}
2. CALCULATOR
public class CALCI 
 public static void main(String[] args) {
    System.out.println(Calculator.powerDouble(85.0, 2));
    System.out.println(Calculator.powerInt(85,3));
    }
}

class Calculator
{
    static double powerInt(int num1,int num2)
    {
        return Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
3.BMI:
import java.util.*;
import java.lang.*;
import java.io.*;
class Patient{
    String name;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double BMI()
  {
      return ((weight/(height*height))*703);
    }
}
    class Patients
{
  public static void main (String[] args)
 {
  Patient p=new Patient(75,156);
  System.out.println("The BMI:"+p.BMI());
   }
}
