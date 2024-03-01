public class MultipleCatchBlocksExample {
    public static void main(String[] args) {
    try {
    int[] numbers = {1, 2, 3};
    int result = numbers[5] / 0; 
    System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
    System.out.println("ArithmeticException occurred: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
    } catch (Exception e) {
    System.out.println("General Exception occurred: " + e.getMessage());
    }
    }
    }
    