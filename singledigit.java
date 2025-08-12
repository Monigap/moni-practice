Write a program to convert the digits of the string into a single number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        for(int i =0; i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                digits.append(ch);
            }
        }
        if(digits.length() == 0){
            System.out.println(0);
        }
        else
            System.out.println(digits.toString());
        
    }
    }
