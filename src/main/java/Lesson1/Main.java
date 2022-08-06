package Lesson1;

public class Main {
    public static void main(String[] args) {
        Animal [] animal = new Animal[4];
        animal[0] = new Dog("Bob", "black", 2, "big");
        animal[1] = new Cat("Murzik", "white", 3, "available");
        animal[2] = new Cat("Barsik", "red", 5, "not available");


        for (Animal eachAnimal: animal) {
            try {
                System.out.println(eachAnimal);
                eachAnimal.getInfo();
                eachAnimal.say();
                eachAnimal.run(-10);
                eachAnimal.run(100);
                eachAnimal.run(300);
                eachAnimal.run(600);
                eachAnimal.swim(-10);
                eachAnimal.swim(5);
                eachAnimal.swim(20);
            } catch (NullPointerException exception) {
                System.out.println("пустой эелемент массива animal: " + exception);
            }

        }

        Animal.printCountAnimal();
        Dog.printCountDog();
        Cat.printCountCat();
    }
}
