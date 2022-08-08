package lesson4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box(T fruit, int number) {
        for(int i = 1; i <= number; i++ ) this.box.add(fruit);
    }

    public void put(T fruit) {
        this.box.add(fruit);
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public double getWeight(){
        return box.stream().mapToDouble(Fruit::getWeight).sum();
    }

    public boolean compare(Box box) {
        final double threshold = 0.0001;
        System.out.println(this.getWeight());
        System.out.println(box.getWeight());
        if(Math.abs(this.getWeight() - box.getWeight()) < threshold) return true;
        return false;
    }

    public void join(Box<T> box) {
        if(this == box) return;
        box.getBox().addAll(this.box);
        this.box.clear();
    }
}
