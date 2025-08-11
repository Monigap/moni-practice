Write a program to count the number of upper-case characters in a given string

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int u = 0;
        for(int i =0;i<n.length();i++)
        {
            char c = n.charAt(i);
            if(c>=65 && c<=90)
                u++;
        }
        System.out.println(u);
    }
}
