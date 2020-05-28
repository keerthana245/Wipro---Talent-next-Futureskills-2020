import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        if(input.contains("a")||input.contains("e")||input.contains("i")||input.contains("o")||input.contains("u"))
        {
        if(input.contains("a"))
        {
            System.out.print("a");
        }
        if(input.contains("e"))
        {
            System.out.print("e");
        }
        if(input.contains("i"))
        {
            System.out.print("i");
        }
        if(input.contains("o"))
        {
            System.out.print("o");
        }
        if(input.contains("u"))
        {
            System.out.print("u");
        }
        }
        else
        {
            System.out.print("Thank You");
        }



    }
}
