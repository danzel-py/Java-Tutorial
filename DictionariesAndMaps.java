import java.util.*;
import java.io.*;


class DictionariesAndMaps{
    public static void main(String []argh){
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(myMap.get(s) == null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+myMap.get(s));
            }
        }
        in.close();
    }
}

/* 
*Create a Map of String Keys to String Values, implemented by the HashMap class
Map<String,String> myMap = new HashMap<String,String>(); 
    
*Adds ("Hi","Bye") mapping to myMap
myMap.put("Hi", "Bye");	

*Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi")); 

*Replaces "Bye" mapping from "Hi" with "Bye!" 
myMap.put("Hi", "Bye!"); 

*Print the Value mapped to from "Hi"
System.out.println(myMap.get("Hi"));  */