import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'pthFactor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER n
     *  2. LONG_INTEGER p
     */

    public static long pthFactor(long n, long p) 
    {   
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[20];
        for(int i=1;i<=n;i++)
        {   if(n%i==0)
            {    //System.out.println(i);
                arr[i-1]=i;
                i++;
            }
            for(int j=0;j<arr.length;j++)
            {
                if(arr[p]==arr[j])
                    num=arr[j];    
            }    
        }
        return num;                      
               
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long p = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.pthFactor(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
