// ByteShortInt compilation, simple stuff, reference sheets

public class ByteShortInt {

  public static void main(String[] args) {
    // int has a width of 32
    int myValue = 10000;
    int myMinValue = -2_146_483_648;
    int myMaxValue = 2_147_483_647;
    int myTotal = (myMinValue/2);

    // byte has a width of 8, requires byte cast for arithmetic
    byte myByteValue = -128;
    byte myNewByteValue = (byte)(myByteValue/2);
    System.out.println("myNewByteValue = " + myNewByteValue);

    // short has a width of 16
    short myShortValueMin = -32768;
    short myShortValueMax = 32767;
    short myNewShortValue = (short)(myShortValueMin / 2);
    System.out.println("myNewShortValue = " + myNewShortValue);

    // long has a width of 64
    long myLongValue = 100l;
    long myLongValue2 = 9_223_372_036_854_775_807L;

    // 1. Create a byte variable and set it to any valid byte number
    // 2. Create a short variable and set it to any valid short number
    // 3. Create an int variable and set it to any valid int number
    // 4. Create a variable of type long and make it equal to 50000 + 10 times
    // the sum of the byte, plus the short plus the int

    byte newByte = 67;
    short newShort = 16;
    int newInt = 10667686;

    long newLong = 50000 * (newInt + newShort + newByte);
    System.out.println("newLong = " + newLong);

  }
}
