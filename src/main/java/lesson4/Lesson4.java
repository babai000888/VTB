package lesson4;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {

        Object[] array = new Object[] {1,2,3,4,5};
        System.out.println("До: " + Arrays.toString(array));
        changeArray(array,2,4);
        System.out.println("После: " + Arrays.toString(array));
        System.out.println("ArrayList: " + toList(array));

        Fruit apple = new Apple();
        System.out.println(apple.getWeight());
        Box<Apple> apples = new Box<>();
        apples.put((Apple)apple);
        System.out.println(apples.getWeight());
    }
    public static void changeArray(Object [] array, int i, int j){
        if(i == j) return;
        if(i < 0 | j < 0) return;
        if(i > array.length | j > array.length) return;
        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static ArrayList<Object> toList (Object[] array){
        return new ArrayList<> (Arrays.asList(array));
    }
}
