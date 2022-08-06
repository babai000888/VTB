package lesson3;

public class Lesson3 {
    public static void main(String[] args) {

        String [][] arr1 = {{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"}};
        String [][] arr2 = {{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"}};
        String [][] arr3 = {{"4","5","6","4"},{"4","5","6","4"},{"4","5","6","4"},{"rr","5","6","4"}};


        try {
            System.out.println(" Сумма: " + method1(arr1));
//            System.out.println(" Сумма: " + method1(arr2));
            System.out.println(" Сумма: " + method1(arr3));
        }catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException);
        }catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException);
        }


    }

    public static int method1 (String [][] arr) {
        int sum = 0;
        if(arr.length != 4 || arr[0].length != 4) throw new MyArraySizeException(arr);
        System.out.println("Размер массива 4x4: " + arr);

        for(int i = 0; i < arr.length; i++ )
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i] [j]);
                } catch (NumberFormatException numberFormatException) {
                    throw new MyArrayDataException(i,j, numberFormatException);
                }
            }
        return sum;
    }
}
