Get two numbers from user and print the values of the quotient and the remainder when the two values are divided.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double quotient = (double) a / b;
        int remainder = a % b;
        System.out.printf("%d / %d = %.6f\n", a, b, quotient);
        System.out.printf("%d %% %d = %d\n", a, b, remainder);
    }
}

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
