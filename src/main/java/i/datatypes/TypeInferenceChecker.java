package i.datatypes;

/**
 * var is not a keyword, type of var is still infered at compile time and cannot be changed later
 * var is used only for local variable type inference
 *
 */
public class TypeInferenceChecker {


    public static void main(String[] args) {
        String message = "Good bye Java 9";
        var newMessage = "Welcome Java 10";
        var age = "99";

        if (message instanceof String) {
            System.out.println("message: " + message);
        }

        if (newMessage instanceof String) {
            System.out.println("newMessage: " + newMessage);
        }

        if (age instanceof String) {
            System.out.println("newMessage: " + newMessage);
        }

//        var n; // error: cannot use 'var' on variable without initializer
//        var emptyList = null; // error: variable initializer is 'null'

//        var p = (String s) -> s.length() > 10; // error: lambda expression needs an explicit target-type

//        var arr = {1, 2, 3}; // error: array initializer needs an explicit target-type


    }


    public void doesThisCompile () {
//        var question; // This does not compile, var on variable without initializer

//        var x = null; // Does not compile
        var x = (String) null;

        var n = "MyData";
        n = null;



    }



}
