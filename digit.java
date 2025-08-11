Count the number of digits in a given number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        long count =0;
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();
        while(n>0)
        {
                n=n/10;
            count ++;
        }
        System.out.println(count);
    }
}
