package study.homework;

public class ByteToInt {

    public static void main(String[] args) {
        convertBinaryToInt(args[0]);
    }

    private static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }

    public static int convertBinaryToInt(String binaryNumber) throws IllegalArgumentException {
        char[] charsArray = binaryNumber.toCharArray();
        int charsArrayLength = charsArray.length;
        int[] intArray = new int[charsArrayLength];
        int decimal = 0;

        for (int i = 0; i < charsArrayLength; i++) {
            intArray[i] = Character.getNumericValue(charsArray[i]);
            if (intArray[i] != 0 && intArray[i] != 1) {
                throw new IllegalArgumentException();
            }
        }

        for (int i = 0; i < charsArrayLength; i++) {
            decimal += intArray[charsArrayLength - 1 - i] * power(2, i);
        }
        System.out.println("input variable - " + binaryNumber + ", output decimal - " + decimal);
        return decimal;
    }
}
