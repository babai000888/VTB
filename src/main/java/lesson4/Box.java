package lesson4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public void put(T fruit) {
        this.box.add(fruit);
    }

    public ArrayList<T> getBox() {
        return box;
    }
    public double getWeight(){
        return box.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(Box<T> box) implements Comp
}
