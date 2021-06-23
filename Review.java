import java.io.*;
import java.util.*;

public class Review {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        scan.nextLine();

        for (int j = 0; j < n; j++) {
            
            
            String strinp = scan.next();
            
            
            
            for (int i = 0; i < strinp.length(); i+=2) {
                System.out.print(strinp.charAt(i));
            }
            System.out.print(' ');
            for (int i = 1; i < strinp.length(); i+=2) {
                System.out.print(strinp.charAt(i));
            }
            System.out.println();
        }
    }
}