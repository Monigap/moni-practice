Write a program to accept the elements into an array and display the sum of the array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,sum = 0;
        size = sc.nextInt();
        int[] a = new int[size];
        for(int i =0;i<size;i++){
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }
        System.out.print(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
