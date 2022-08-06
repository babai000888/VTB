package Lesson1;

public class Cat extends Animal{
    private static int countCat;
    private String status;
    private final String typeCat = "Кошка";
    private final int maxRunCat = 200;
    private final int maxSwimCat = 0;

    public Cat(String name, String color, int age, String status) {
        super(name, color, age);
        this.status = status;
        this.maxRun = maxRunCat;
        this.maxSwim = maxSwimCat;
        this.type = typeCat;
        countCat++;
    }

    @Override
    public void say() {
        System.out.println("Myau! " + status);
    }

    public static void printCountCat() {
        System.out.println("Всего " + countCat + " котов");
    }

}
