import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int x,y,index=0,temp1,temp2;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        int[] inarr=new int[x];
        int[][] arr=new int[x][2];
        for(int i=0;i<x;i++){
            inarr[i]=s.nextInt();
        }
        for(int i=0;i<x;i++){
            y=0;
            for(int j=0;j<x;j++){
                if(inarr[i]==arr[j][0]){
                    y=1;
                }
            }
            if(y==0){
                arr[index][0]=inarr[i];
                for(int k=0;k<x;k++){
                    if(arr[index][0]==inarr[k]){
                        arr[index][1]++;
                    }
                }
                index++;
            }
        }
        for(int i=0;i<index;i++){
            for(int j=i+1;j<index;j++){
                if(arr[i][1]<arr[j][1]){
                    temp1=arr[i][0];
                    temp2=arr[i][1];
                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];
                    arr[j][0]=temp1;
                    arr[j][1]=temp2;
                }
            }
        }
        for(int i=0;i<index;i++){
            System.out.print(arr[i][0]+" ");
        }
    }
}
