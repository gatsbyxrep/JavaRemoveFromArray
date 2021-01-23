import java.util.Arrays;
public class Main {

    public static <T extends Comparable<T>> T[] removeElement(T[] array, T elementToRemove) {
        int removesCount = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i].compareTo(elementToRemove) == 0) {
                removesCount++;
            } else {
                array[i - removesCount] = array[i];
            }
        }
        return Arrays.copyOf(array, array.length - removesCount);
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[]{10, 0, 2, 1, 10, 5, 10, 28};
        System.out.println(Arrays.toString(removeElement(array, 10)));
    }
}
