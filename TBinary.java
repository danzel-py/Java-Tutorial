import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class TBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String str = "";
        int con = 0;
        int maxcon = 0;
        while(n!=0){
            if(n%2 == 1){
                con++;
            }else{
                con = 0;
            }
            maxcon = Math.max(con,maxcon);
            
            str = Integer.toString(n%2) + str;
            n/=2;
        }
        System.out.print(maxcon);

        bufferedReader.close();
    }
}
