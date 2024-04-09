package org.launchcode;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister "
                + "on the bank, and of having nothing to do: once or twice she had "
                + "peeped into the book her sister was reading, but it had no pictures "
                + "or conversations in it, ‘and what is the use of a book,’ thought Alice "
                + "‘without pictures or conversation?’";

        // Prompt the user for a term to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a term to search for: ");
        String searchTerm = scanner.nextLine();

        // Perform case-insensitive search
        if (firstSentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("The search term was found.");
        } else {
            System.out.println("The search term was not found.");
        }
    }
}
