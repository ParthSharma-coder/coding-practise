# Operators - The Clock System

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Your friend has problem a reading the time if a clock follows 24-hour format so you decide to help him out. You have two integers X and Y. Your task is to find and return an integer value representing the product of these two integer in the 12-hour system.

 **Input Format** 

- An integer value X
- An integer value Y

 **Constraints** 

NA

 **Output Format** 

Return an integer value representing the product of the two integers in the 12 hour system.

 **Sample Input 0** 

```
4
5

```

 **Sample Output 0** 

```
8

```

 **Explanation 0** 

Here, X = 4 and Y= 5 and their product is 4*5=20. Therefore, 8 is returned as the output in 12-hour system.

 **Sample Input 1** 

```
2
5

```

 **Sample Output 1** 

```
10

```

 **Explanation 1** 

Here X= 2 and Y= 5 and these product is 2*5=10, Therefore, 10 is returned as the output in 12-hour system.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T16:46:31.846Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a*b)%12==0)
        {
            System.out.println("12");
        }
        else 
        {
            System.out.println((a*b)%12);
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/operators-the-clock-system/problem)