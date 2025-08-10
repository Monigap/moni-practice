Find the greatest prime factor of given number.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int  n = sc.nextInt();
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0)
                n = n/i;
            else
                i++;
        }
        System.out.println(n);
    }
}
