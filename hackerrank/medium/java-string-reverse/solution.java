import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String c=A;
        String s="";
        for(int i=c.length()-1;i>=0;i--)
        {
            char a=c.charAt(i);
            s=s+a;
        }
        
        if(s.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}



