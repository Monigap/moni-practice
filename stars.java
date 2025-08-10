Print the following pattern

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,row,space,star;
        n = sc.nextInt();
        for(row=1;row<=n;row++){
            for(space=1;space<=n-row;space++){
                System.out.printf(" ");
            }
            for(star=1;star<=n;star++){
                System.out.printf("*");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
