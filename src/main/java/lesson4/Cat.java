package lesson4;

public class Cat {
    private int age = 20;
    String name = "---";
    static int totalAmount = 0;

    public Cat() {
        Cat.totalAmount++;
        System.out.println("Initialized new Cat");
    }

    public Cat(String name) {
        this();
        this.name = name;
    }
    public Cat(String name, int age) {
        this();
        this.name = name;
        this.validateAge(age);
    }

    private void validateAge(int age) {
        if(age > 0 && age <= 21) {
            this.age = age;
        } else {
            System.out.println("Error, age can not have value " + age);
        }
    }

    public void setAge(int value) {
        this.validateAge(value);
    }

    public int getAge() {
        return age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    protected void sayBy() {
        System.out.println("Good by!!!");
    }

    public static int getDefaultAge() {
        return 20;
    }
}
