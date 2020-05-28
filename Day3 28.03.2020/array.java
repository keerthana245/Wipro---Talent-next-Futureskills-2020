1. program to initialize an integer array and print the sum and average of the array. 
import java.util.Scanner;
public class Java {
 public static void main(String[] args) {
        System.out.println("How many numbers you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
  for(int i=0; i<arr.length; i++){
        	System.out.print("Enter Element No."+(i+1)+": ");
        	arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
 double average = total / arr.length;
   System.out.format("The average is: %.3f", average);
    }
}
2.program to initialize an integer array and find the maximum and minimum value of an array
class MinMax {  
  public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}

3.Write a program to initialize an integer array with values and check if a given number is present in the array or not. 
public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int toFind = 3;
        boolean found = false
 for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }
   if(found)
            System.out.println(n[ num] );
        else
            System.out.println("-1");
    }
}
4.Initialize an integer array with ascii values and print the corresponding character values in a single row
public class AsciiToCharacter 
{
   public static void main(String[] args) 
   {
 char c;  //Character Variable Declaration
  for(int i=65;i<=90;i++) 
      {
         c =(char)i; 
         System.out.println(i+"  =  "+c);
      }
   }
}
5.program to find the largest 2 numbers and the smallest 2 numbers in the given array 
import java.io.*; 
class TwoSmallest 
{ 
static void print2Smallest(int arr[]) 
{ 
int first, second, arr_size = arr.length; 
if (arr_size < 2) 
System.out.println(" Invalid Input "); 
return;
  } 
first = second = Integer.MAX_VALUE; 
  for (int i = 0; i < arr_size ; i ++) 
{ 
       if (arr[i] < first) 
  { 
                second = first; 
                 first = arr[i]; 
      } 
  else if (arr[i] < second && arr[i] != first) 
            second = arr[i]; 
  } 
   if (second == Integer.MAX_VALUE) 
             System.out.println("There is no second" +   "smallest element");
  else
         System.out.println("The smallest element is " +   first + " and second Smallest" +   " element is " + second);
    } 
5 b .Largest two numbers:
import java.util.Scanner;
public class largest_and_second
{
	public static void main (String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}
 
		int largest1, largest2, temp;
                         largest1 = array[0];
		largest2 = array[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
                    for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
System.out.println ("The First largest is " + largest1);
System.out.println ("The Second largest is " + largest2);
}
}
6. Write a program to initialize an array and print them in a sorted fashion
public class Sort {    
    public static void main(String[] args) {        
        int [] arr = new int [] {5, 2, 8, 7, 1};     
        int temp = 0;       
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();      
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    

7. Write a program to remove the duplicate elements in an array and print

public class RemoveDuplicate{  
public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) {  
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  

8. Write a program to print the element of an array that has occurred the highest number of times 
import java.util.*; 

class Group{ 
	
	static int mostFrequent(int arr[], int n) 
	{ 
		
		 
		Arrays.sort(arr); 
		int max_count = 1, res = arr[0]; 
		int curr_count = 1; 
		
		for (int i = 1; i < n; i++) 
		{ 
			if (arr[i] == arr[i - 1]) 
				curr_count++; 
			else
			{ 
				if (curr_count > max_count) 
				{ 
					max_count = curr_count; 
					res = arr[i - 1]; 
				} 
				curr_count = 1; 
			} 
		} 
	
		if (curr_count > max_count) 
		{ 
			max_count = curr_count; 
			res = arr[n - 1]; 
		} 
	
		return res; 
	} 

	public static void main (String[] args) { 
			int arr[] = {1, 5, 2, 1, 3, 2, 1}; 
		int n = arr.length; 
		
		System.out.println(mostFrequent(arr,n)); 
		
	} 
} 
9. Write a program to print the sum of the elements of the array with the given below condition. If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for the calculation of sum.
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
               
            }
             sc.close();
            int num1 = 6;
            int num2 = 7;
            int sum = 0;
            boolean flag = false;
            for(int i : arr){
                if(i == num1){
                    flag = true;
                }
                if(flag == true){
                    if(i == num2){
                        flag = false;
                    }
                    continue;
                }
                else{
                    if(i == 7 ){
                        sum += 6+i;
                    }
                    else
                        sum += i;
                }
            }
            System.out.println("sum is "+sum);
           
           
           
    }

}

10. Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
public class Alpha {

    public static void main(String args[])
    {
    int a=args.length;
    int x,y,w,z,i;
    int arr[][] = new int[4][4];
    if(a<4)
    {
    System.out.println("enter 4 values");
    }
    if(a==4)
        
    {
        int k=0;
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            
        arr[i][j]=Integer.parseInt(args[k]);
        k++;
        }
        
    }
    System.out.println("The given array is:");
    for(i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }
    System.out.println("The reverse of array is:");
    for(i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        
    }
  }  
}
}
11. Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.
// Java Program to find maximum in arr[] 
class Beta 
{ 
	static int arr[] = {10, 324, 45, 90, 9808}; 
	static int largest() 
	{ 
		int i;  
		int max = arr[0]; 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		
		return max; 
	} 
	public static void main(String[] args) 
	{ 
		System.out.println("Largest in given array is " + largest()); 
		} 
}
