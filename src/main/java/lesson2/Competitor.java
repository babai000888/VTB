package lesson2;

public interface Competitor {
    default boolean run(String type, String name, int length, int maxLength) {
        System.out.println(length <= maxLength
                ? type + " " + name + " пробежал " +  length + " метров."
                : type + " " + name + " не пробежал " +  length + " метров. Максимум " + maxLength);
        return length > maxLength;
    };
    default boolean jump(String type, String name, int hight, int maxHight) {
        System.out.println(hight <= maxHight
                ? type + " " + name + " прыгнул на " +  hight + " метров."
                : type + " " + name + " не прыгнул на " +  hight + " метров. Максимум " + maxHight);
        return hight > maxHight;
    }
}
