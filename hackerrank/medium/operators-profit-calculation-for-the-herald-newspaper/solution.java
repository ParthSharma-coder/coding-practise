import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int cost=sc.nextInt();
        int expense=sc.nextInt();
        System.out.println((number*(cost-expense))-100);
    }
}
