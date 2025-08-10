Write a program to accept the array and position in which the new element to be inserted from the user and display the array.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size,data,pos,i;
        size = sc.nextInt();
        int[] a = new int[size+1];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        data = sc.nextInt();
        pos = sc.nextInt();
        for(i = size;i>pos-1;i--){
            a[i] = a[i-1];
        }
        a[pos-1] = data;
        for(i=0;i<size+1;i++){
            System.out.print(a[i]+" ");
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
