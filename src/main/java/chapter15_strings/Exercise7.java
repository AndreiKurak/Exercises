package chapter15_strings;

/**
 * Exercise 7:   (5) Using the documentation for java.util.regex.Pattern as a resource,
 *                   write and test a regular expression that checks a sentence to see that it begins with a capital
 *                   letter and ends with a period.
 */

public class Exercise7 {

    public static void main(String[] args){
        String sentence = "London is the capital of Great Britain.";
        System.out.println(sentence.matches("(^\\p{Upper}.*)(.*(\\.$))"));
        String s = "abcabcabc";
        System.out.println(s.matches("(abc){4}+"));
    }
}
