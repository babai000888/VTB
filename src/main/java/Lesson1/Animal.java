package Lesson1;

public abstract class Animal {
    private static int countAnimal;
    protected String type;
    protected String name;
    protected String color;
    protected int age;
    protected int maxRun;
    protected int maxSwim;
    private String action;

    public Animal(String name, String color, int age) {
        countAnimal++;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void say();

    public void getInfo() {
        System.out.println(this.toString());
    }

    public static void printCountAnimal() {
        System.out.println("Всего " + countAnimal + " животных");
    }

    public void action(int dist, int maxDistance, String action) {
        if(dist < 0) System.out.println(type + " " + name + " не может " + action + " отрицательное расстояние");
        else {
            if(dist <= maxDistance) System.out.println(type + " " + name + " смог " + action + dist + " метров");
            else System.out.println(type + " " + name + " не может " + action + dist + " метров. Максимум это " + maxDistance);
        }
    }
    public void run(int dist) {
        action = " пробежать ";
        action(dist, maxRun, action);
    }
    public void swim(int dist) {
        action = " проплыть ";
        action(dist, maxSwim, action);
    }

    @Override
    public String toString() {
        return ("name = " + name + " color = " + color + " age = " + age);
    }
}
