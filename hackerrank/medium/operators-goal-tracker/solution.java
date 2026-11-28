import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S=sc.nextInt();
        int D=sc.nextInt();
        int N=sc.nextInt();
        double n=(double)N;
        double x=(S-D)/n;
        System.out.println(Math.round(x));
    }
}
