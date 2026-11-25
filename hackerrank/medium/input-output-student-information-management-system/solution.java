import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name =sc.next();
        int age = sc.nextInt();
        double cgpa = sc.nextDouble();
        String grade = sc.next();
        
        double newcgpa = Math.floor(cgpa*100)/100;
    
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.printf("CGPA: %.2f\n",newcgpa);
        System.out.println("Grade: "+grade);
    }
}
