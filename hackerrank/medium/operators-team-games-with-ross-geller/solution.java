import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=sc.nextInt();
        int t=sc.nextInt();
        System.out.println("The number of friends in each team is "+f/t+" and left out is "+f%t);
    }
}
