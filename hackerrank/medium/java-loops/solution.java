import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=1;j<n+1;j++)
            {
                double h = Math.pow(2,j);
                int k =(int)h;
                System.out.print(a+((k)-1)*b+" ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
