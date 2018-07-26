// Float and Double bootcamp stuff

public class FloatAndDouble {

  public static void main(String[] args) {
    // width of an int = 32 (4 bytes).
    int myIntValue = 5 / 2;
    // width of float = 32 (4 bytes).
    float myFloatValue = 5f / 6.56f;
    // width of double = 64 (8 bytes).
    double myDoubleValue = 10d / 5.25d;

    System.out.println("myIntValue = " + myIntValue);
    System.out.println("mFloatValue = " + myFloatValue);
    System.out.println("myDoubleValue = " + myDoubleValue);

    // Convert a given number of pounds to kilograms
    // 1. Create a variable to store the number of pounds
    // 2. Calculate the number of Kilograms for the number above and store in a variable
    // 3. Print out the result.
    //
    // NOTES: 1 pound is equal to 0.45359237 Kilograms

    double numPounds = 200d;
    double convertedKilograms = numPounds * 0.45359237d;
    System.out.println("Kilograms = " + convertedKilograms);
  }
}
