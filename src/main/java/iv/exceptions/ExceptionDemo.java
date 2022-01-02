package iv.exceptions;

import javax.lang.model.type.ArrayType;

public class ExceptionDemo {

    public static void main(String[] args) {
        int data = getQuotient(100, 0);
        int length = getLength(null);
        parseIntoInt("Boston1");
        int[] arr = new int[5];
        getIndexedNumber(arr, 10);
        getIndexedNumber2(arr, 10);
    }

    public static int getQuotient(int number1, int number2){
        int quot = 0;
        try {
            quot = number1/number2;
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e);
        }
        return quot;
    }

    public static int getLength (String str) {
        int length = 0;
        try {
            length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Exception" + e);
        }
        return length;
    }

    public static int parseIntoInt (String str) {
        int number = 0;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e);
        }
        return number;
    }

    public static int getIndexedNumber (int[] arr, int index) {
        int result = 0;
        try {
            result = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
        return result;
    }

    public static int getIndexedNumber2 (int[] arr, int index) {
        try {
            arr[index] = 30/0;
            System.out.println(arr[10]);
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Exception" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception" + e);
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
        return 0;
    }
}
