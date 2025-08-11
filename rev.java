Write a program to reverse a given string without using in-built functions

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
             rev = rev + s.charAt(i);
        }
        System.out.print(rev);
    }
}
