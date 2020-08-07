package lesson3;

public class W_String_methods {
    public static void main(String[] args) {
        String name = "VodDdDddva";
        /*System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.toLowerCase());*/

        System.out.println(myToLowerCase(name));
    }

    public static String myToLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += Character.toString(str.charAt(i)).toLowerCase();
        }
        return result;
    }
}
