package Lesson1;

public class Dog extends Animal{
    private static int countDog;
    private String size;
    private final String typeDog = "Собака";
    private final int maxRunDog = 500;
    private final int maxSwimDog = 10;

    public Dog(String name, String color, int age, String size) {
        super(name, color, age);
        this.size = size;
        this.maxRun = maxRunDog;
        this.maxSwim = maxSwimDog;
        this.type = typeDog;
        countDog++;
    }

    @Override
    public void say() {
        System.out.println("GAV! " + size);
    }

    public static void printCountDog() {
        System.out.println("Всего " + countDog + " собак");
    }
}
