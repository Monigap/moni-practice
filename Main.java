Write a program to accept the array and count the number of odd and even numbers in the given array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int i,count=0,count1=0,size;
        size = sc.nextInt();
        int[] a = new int[size];
        for(i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        for(i=0;i<size;i++){
            if(a[i]%2==0){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println("Odd = "+count1);
        System.out.print("Even = "+count);
}
}
