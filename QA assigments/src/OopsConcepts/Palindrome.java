package OopsConcepts;

public class Palindrome {

     public static void main(String[] args) {
          System.out.println("=======palindrome=======");
          //words that written from end to beginning means the same
          System.out.println(isPalindrom("dad"));
          System.out.println(isPalindrom("Eva, can i see bees in the cave?"));

     }

     public static boolean isPalindrom(String givenString) {
          String rev = "";

          //storing the String into the variable
          int len = givenString.length();
          //length-1 means the last character for example in an array from 1-10 it will start from 10
          //the for loop is decrementing starting from final to beginner
          for (int i = len - 1; i >= 0; i--) {
               rev = rev + givenString.charAt(i);
          }
          //equalsIgnoreCase--->this will help avoid the lower cases and capital letters
          if (givenString.equalsIgnoreCase(rev)) {
               return true;


          } else return false;

     }
}