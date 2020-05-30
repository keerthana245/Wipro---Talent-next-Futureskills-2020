1.Palindrome or not
import java.util.Scanner;
 class Palindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = sc.nextLine();
  int length = str.length();
   for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
    }
}
2.
public class S2 {
public static void main(String[] args) {
		String str1 = "Mark";
		String str2 = "Kate";
		str1 = str1.toLowerCase();
                           str2 = str2.toLowerCase();
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			sb.append(str2.substring(1, str2.length()));
		} else {
			sb.append(str2);
		}
		System.out.println(sb);		
		sb.append(str1);
		}
}
3.
public class S3 {

	public static void main(String[] args) {
		String str = "Wipro";
		int n = str.length();
		
		String repeater = "";
		if (n < 2) repeater = str;
		else repeater = str.substring(0, 2);
		String output = "";
		for (int i = 0; i < n; i++) {
			output += repeater;
}
	System.out.println(output);
}
}
4.
public class S4 {
public static void main(String[] args) {
		String str = "CatDogs";
		String output;
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} else {
			output = null;
		}
		System.out.println(output);
	}
}
5.
public class S5 {
public static void main(String[] args) {
		String str = "Wipro";
		str = str.substring(1, str.length() - 1);
		System.out.println(str);
}
}
6.
public class S6 {
public static void main(String[] args) {
		String a = "hi";
		String b = "hello";
		String output;
          if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
                 System.out.println(output);
	}
}
7.
public class S7 {
public static void main(String[] args) {
		String str = "xHix";
		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());
		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		System.out.println(str);
}
}

8.
public class S8 {
	public static void main(String[] args) {
		String str1 = "Wipro";
		String str2 = "X";
		int separator = 3;
		StringBuffer sb = new StringBuffer();
		for (int i = 0 ; i < separator - 1; i++) 
			sb.append(str1).append(str2);
		sb.append(str1);
		System.out.println(sb);
	}
}
9.
public class S9 {
public static void main(String[] args) {
		String str = "ab*cd";
		String[] strs = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : strs)
			sb.append(x);
System.out.println(sb);
}
}

10.
public class S10 {
public static void main(String[] args) {
		String a = "Helloo";
		String b = "World123abc";
                          String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;
                          StringBuffer sb = new StringBuffer();
                          for (int i = 0; i < smaller.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		System.out.println(sb);
	}
}
11.
public class S11 {
public static void main(String[] args) {
		String a = "abc";
		String b = "xyz";
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;
                      StringBuffer sb = new StringBuffer();
                        for (int i = 0; i < smaller.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		System.out.println(sb);
	}
}
12.
public class S12 {
public static void main(String[] args) {
		String str = "Wipro";
		int n = 3;
		StringBuffer sb = new StringBuffer();
			for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}
System.out.println(sb);
	}
}
13.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class S13 {
public static void main(String[] args) {
String str1 = "abcXY123XYijk"; // "XY123XY"
		String str2 = "XY";
		StringBuffer sb = new StringBuffer();
		while (str1.indexOf(str2) != -1) {	
			int index = str1.indexOf(str2);
			if (index == 0 && index + str2.length() < str1.length() - 1) {
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			if (index - 1 >= 0 && index + str2.length() >= str1.length()) {
				sb.append(str1.charAt(index - 1));
				str1 = str1.replaceFirst(str2, "");
				continue;
			}
			if (index + str2.length() < str1.length() - 1 && index - 1 >= 0) {
				sb.append(str1.charAt(index - 1));
				sb.append(str1.charAt(index + str2.length()));
				str1 = str1.replaceFirst(str2, "");
			}
		}

		System.out.println(sb);
	}

}
