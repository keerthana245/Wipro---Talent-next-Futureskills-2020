import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) 
    {   
        //for(int i=1;i<=n;n--)
        int i=1;
        while(i<=n)
        {
            if((i%3==0) && (i%5==0))
            {    System.out.println("FizzBuzz");
                 i++;
            }
            else if(i%3==0)
            {    System.out.println("Fizz");
                 i++;
            }
            else if(i%5==0)
            {    System.out.println("Buzz");
                 i++;
            }
            else
            {    System.out.println(i);
                 i++;
            }
        }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
