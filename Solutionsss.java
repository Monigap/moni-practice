Write a program to accept the elements into an array and replace every element in the array with the sum of left side element

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,sum=0;
        int size = sc.nextInt();
        int[] a = new int[size];
        for(i=0;i<size;i++){
            System.out.print(sum+" ");
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
