package RunningtimeComplexity;

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            Boolean prime = true;
            int num = s.nextInt();
            int nsq = (int)Math.sqrt((double)num) + 2;
            
            if(num == 1){
                prime = false;
            }
            else if(num == 2){
                prime = true;
            }
            else if(num%2 == 0){
                prime = false;
            }else{
                for (int j = 3; j < nsq; j+=2) {
                    if(num%j == 0){
                        prime = false;
                        break;
                    }
                }
            }
            if(prime){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");

            }
        }

    }
}