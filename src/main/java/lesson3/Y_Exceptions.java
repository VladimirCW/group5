package main.java.lesson3;

public class Y_Exceptions {
    public static void main(String[] args) {
        System.out.println("main method");
        Y_Exceptions.first();
    }

    public static void first() {
        System.out.println("First method");
        try {
            Y_Exceptions.second();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void second() throws Exception {
        /*try {
            System.out.println(1/0);
        } catch (Exception e) {

        } finally {

        }*/
        System.out.println(1/0);
        System.out.println("Second method");
        Y_Exceptions.third();
    }

    public static void third() {
        System.out.println("Third");
    }
}
