package nested;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);

        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();

        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();
        int hackos = 0;


        if( y1 < y2 || (y1 == y2 && m1 < m2) || (y1 == y2 && m1==m2 && d1<d2)){
            System.out.println(0);
            return;
        }


        if(y1 != y2){
            hackos = 10000;
        }else if(m2 != m1){
            hackos = (m1-m2)*500;
        }else{
            hackos = (d1-d2)*15;
        }

        System.out.println(hackos);

    }
}
