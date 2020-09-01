package main.java.lesson9;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
        cat.sleep();
        System.out.println(cat.toString());
        IAnimable animals[] = {new Cat(), new Dog(), new ImmortalPonny(), cat};
        IMashinable cars[] = {new ImmortalPonny()};
        IAnimable cat2 = new Cat();
        cat2.sleep();
        Animal cat3 = new Cat();
        cat3.toString();

        Animal one = new Cat();
        //Cat cat4 = new Animal();
        Cat cat5 = (Cat)one;

        System.out.println(System.getProperty("os.name"));
    }
}
