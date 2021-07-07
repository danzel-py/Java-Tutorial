package bubbleSort;

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int c = 0;
        for (int i = 0; i < a.size()-1; i++) {
            if(a.get(i) > a.get(i+1)){
                int tmp = a.get(i);
                a.set(i, a.get(i+1));
                a.set(i+1, tmp);
                c++;
                i = -1;
            }
        }

        bufferedReader.close();
        System.out.print("Array is sorted in " + c +" swaps.\n");
        System.out.print("First element: "+a.get(0)+"\n");
        System.out.print("Last element: "+a.get(a.size()-1)+"\n");
    }
}

