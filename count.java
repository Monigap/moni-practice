Write a java program Count the number of occurrences of a digit in a given number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, count = 0;
        int n = sc.nextInt();
        int b = sc.nextInt();
        while(n>0)
        {
            s= n%10;
             n = n/10;
            if(s == b)
                count++;
        }
        System.out.println(count);
        }
}
