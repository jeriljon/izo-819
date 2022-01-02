package i.datatypes;

/**
 * String, StringBuilder, StringBuffer
 * String is immutable. StringBuilder & StringBuffer are mutable, StringBuilder does not guarantee thread safety, StringBuffer is threadsafe
 */
public class StringManipulation {

    public static void main(String[] args) {
        System.out.println(concatStringToString("Jeril"));
        System.out.println(concatStringToStringBuilder(new StringBuilder("Jeril")));
        System.out.println(concatStringToStringBuffer(new StringBuffer("Jeril")));
    }

    public static String concatStringToString (String str) {
        return "Hello" + str;
    }

    public static String concatStringToStringBuilder (StringBuilder stringBuilder) {
        return stringBuilder.append("Hello").toString();
    }

    public static String concatStringToStringBuffer (StringBuffer stringBuffer) {
        return stringBuffer.append("Hello").toString();
    }


}


