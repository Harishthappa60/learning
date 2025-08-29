package exceptions.unchecked;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 23, 4, 5};
        System.out.println(numbers[5]);
    }
}
