// Char and Boolean reference for the java programming language

public class CharaAndBoolean {

  public static void main(String[] args) {
    // width of 16 (2 bytes)
    char myChar = '\u00A9';
    System.out.println("Unicode output was: " + myChar);
    char specialChar = '&';

    boolean myBoolean = false;
    boolean isMale = true;

    // 1. Find the code for the registered symbol on the same line as the copyright symbol.
    // 2. Create a avariable of type char and assign it the unicode value for that symbol
    // 3. Display on screen.

    char registeredSymbol = '\u00AE';
    System.out.println("Registered symbol = " + registeredSymbol);
  }
}
