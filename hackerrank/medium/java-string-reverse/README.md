# Java String Reverse

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.  

***
Given a string $A$, print ``Yes`` if it is a palindrome, print ``No`` otherwise. 


**Input Format**

 

**Constraints**

* $A$ will consist at most $50$ lower case english letters.

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-23T17:30:49.730Z  

```java
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




```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-string-reverse/problem)