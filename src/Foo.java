
public class Foo {

    @CheckGetter
    static boolean boolValue;
    @CheckGetter
    @Deprecated
    private int intValue;

    public static void main(String[] args) {
        boolValue = true;
        if (boolValue) System.out.println("Hello, Java!");
        if (boolValue == true) System.out.println("Hello, JVM!");
    }
}