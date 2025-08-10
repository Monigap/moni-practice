Write a progam to display the following pattern.

  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,col,row;
        n = sc.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
