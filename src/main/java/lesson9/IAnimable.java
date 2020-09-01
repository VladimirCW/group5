package main.java.lesson9;

public interface IAnimable {
    void sleep();
    void eat();
    default void run() {
        System.out.println("I am running ....");
    };
}
