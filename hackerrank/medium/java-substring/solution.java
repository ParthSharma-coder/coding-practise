import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        String x ="";
        for(int i=start;i<end;i++)
        {
            char t= S.charAt(i);
            x=x+t;
        }
        System.out.println(x);
    }
}
