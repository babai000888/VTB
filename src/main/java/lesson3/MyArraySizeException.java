package lesson3;

public class MyArraySizeException extends RuntimeException {
    private Object [][] array;
    public MyArraySizeException(Object [][] array) {
        super("Array " + array + " is not 4x4, but " + array.length + "x" + array[0].length);
    }
}
