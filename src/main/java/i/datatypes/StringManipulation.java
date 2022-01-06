package i.datatypes;

/**
 * String, StringBuilder, StringBuffer
 * String is immutable. StringBuilder & StringBuffer are mutable, StringBuilder does not guarantee thread safety, StringBuffer is threadsafe
 */
public class StringManipulation {

    public static void main(String[] args) {
//        System.out.println(concatStringToString("Jeril"));
//        System.out.println(concatStringToStringBuilder(new StringBuilder("Jeril")));
//        System.out.println(concatStringToStringBuffer(new StringBuffer("Jeril")));
        WhyWeNeedStringBuilder();
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

    /**
     * Below function will create 27 String objects, most of which are immediately available for garbage collection, which is very inefficient.
     * Java solution is StringBuilder, which builds a String without storing all those interim String values. StringBuilder is not immutable
     */
    public static void WhyWeNeedStringBuilder () {
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

        // String builder way of doing the above
        StringBuilder beta = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            beta.append(current);
        System.out.println(beta);
    }

}


