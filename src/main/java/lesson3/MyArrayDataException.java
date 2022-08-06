package lesson3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j, NumberFormatException numberFormatException) {
        super("Ячейка [" + i + "," + j + "] не может быть преобразована в целое: " + numberFormatException);
    }
}
