Print the following pattern

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , row ,col;
        n = sc.nextInt();
        for(row =1;row<=n;row++){
            for(col=1;col<=n;col++){
                if((row+col)%2==0)
                    System.out.printf("1");
                else
                    System.out.printf("0");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

