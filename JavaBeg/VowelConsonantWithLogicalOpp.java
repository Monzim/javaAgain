package JavaBeg;

import java.util.Scanner;

public class VowelConsonantWithLogicalOpp {
    public static void main(String[] args) {
        Scanner inputWord = new Scanner(System.in);
        char word;
        // , a, e, i, o, u;

        System.out.print("Input a single English word: ");

        word = inputWord.next().toLowerCase().charAt(0);

        if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u') {
            System.out.println("Your word first charecter is a Vowel");
        } else {
            System.out.println("Your word first charecter is a Consonant");
        }
    }

}
