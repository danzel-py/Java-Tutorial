import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class QnS {
    // Write your code here.
    Queue<Character> q = new LinkedList<Character>();
    Stack<Character> st = new Stack<Character>();

    void pushCharacter(Character ch){
        st.add(ch);
    }
    void enqueueCharacter(Character ch){
        q.add(ch);
    }
    char popCharacter(){
        return st.pop();
    }
    char dequeueCharacter(){
        return q.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QnS p = new QnS();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}