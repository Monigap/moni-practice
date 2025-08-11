Write a program to accept the string from the user and display the string in the password format without making any change in the input array


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.print("*");
        }
    }
}
