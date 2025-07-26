/*program to find the given string is palindrome or not.*/

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String s= input.nextLine();
        
        String r = "";

        // Reverse the string
        for (int i =s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }

        // Check if palindrome
        if (s.equals(r)) {
            System.out.println(s+ " is a palindrome.");
        } else {
            System.out.println(s+ " is not a palindrome.");
        }
    }
}
