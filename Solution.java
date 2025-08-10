Write a  program to accept the array from the user and print the array from left to right

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] a = new int[size];
        for(int i =0;i<size;i++){
              a[i] = sc.nextInt();
        }
        for(int i =0;i<size;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
