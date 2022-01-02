package i.datatypes;

/**
 * Wrapper are needed to use in Collections API. Generics need objects, and not primitives.
 * Wrapper class objects allow null values while primitive data type does not allow it.
 * The 8 primitive data types are not objects. [ byte, short, int, long, float, double, char, boolean ]
 */
public class WrapperUsage {

    public static void main(String[] args) {
        int num = 100;
        Integer object = Integer.valueOf(num);
        int number = object.intValue();
        System.out.println(num + object + number);
        System.out.println(num + " " + object + " " + number);
    }


}
