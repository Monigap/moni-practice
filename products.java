Write a java Program to find the product of the digits in a given number.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  s, pro = 1;
        int n = sc.nextInt();
        while(n>0){
            s = n%10;
            n = n/10;
            pro = pro * s;
        }
        System.out.print(pro);
    }
}
