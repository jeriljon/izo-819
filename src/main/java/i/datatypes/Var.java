package i.datatypes;

public class Var {
    public static void main(String[] args) {
        var();
        Var();
    }
    public static void var () {
        var var = "var";
        System.out.println("var: " + var);
    }

    public static void Var () {
        Var var = new Var();
        System.out.println("Var object: " + var);
    }
}
