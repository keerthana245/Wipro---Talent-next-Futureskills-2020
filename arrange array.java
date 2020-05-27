import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String in=new String();
        String out=new String();
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        Scanner s=new Scanner(System.in);
        in=s.next();
        char[] str=in.toCharArray();
        for(int i=0;i<str.length;i++){
            if(str[i]>='A' && str[i]<='Z'){
                str2.append(str[i]);
            }
            else{
                str1.append(str[i]);
            }
        }
        System.out.print(str1+""+str2);

    }
}
