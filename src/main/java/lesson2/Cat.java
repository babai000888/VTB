package lesson2;

public class Cat implements Competitor {
    private String type;
    private String name;
    private int maxLength;
    private int maxHight;

    public Cat(String name, int maxLength, int maxHight) {
        this.type = "Кошка";
        this.name = name;
        this.maxLength = maxLength;
        this.maxHight = maxHight;
    }

    public boolean run(int length) {
        return run(type, name, length, maxLength);
    }

    public boolean jump(int hight) {
        return jump(type, name, hight, maxHight);
    }
}
