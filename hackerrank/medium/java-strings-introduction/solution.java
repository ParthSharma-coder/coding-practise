import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        String a=A.toLowerCase();
        String b=B.toLowerCase();
        
        System.out.println(a.length()+b.length());
        
        int i=0;
        while(i<a.length())
        {
            char a1=a.charAt(i);
            if(a1==' ')
            {
                System.out.println("No");
                break;
            }
            char b1=b.charAt(i);
            int an = (int) a1;
            int bn = (int) b1;
            if(an>bn)
            {
                System.out.println("Yes");
                break;
            }
            else if(an<bn)
            {
                System.out.println("No");
                break;
            }
            else 
            {
               i++;
            }
           
        }   

        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
    }
}



