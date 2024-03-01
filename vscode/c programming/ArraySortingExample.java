import java.util.Arrays;
public class ArraySortingExample {
public static void main(String[] args) {
char[] alphabets = {'b', 'e', 'a', 'c', 'd'};
System.out.println("Original array: " + Arrays.toString(alphabets));
Arrays.sort(alphabets);
System.out.println("Sorted array: " + Arrays.toString(alphabets));
}
}
