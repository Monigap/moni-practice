Write a program to replace all vowels with spaces

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans ="";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u')
                ans = ans +" ";
            else
                ans = ans + c;
        }
          System.out.println(ans);
    }
}
