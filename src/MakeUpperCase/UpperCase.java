package MakeUpperCase;

public class UpperCase {
    public static String MakeUpperCase(String str) {

        str = "hello";

        String strUpper = str.toUpperCase();

        System.out.println("Original String" + " " + str);
        System.out.println("New String" + " " + strUpper);

        return strUpper;
    }

    public static void main(String[] args) {
        System.out.println(MakeUpperCase("hello" ));
    }
}



