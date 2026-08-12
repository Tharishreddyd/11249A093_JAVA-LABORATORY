class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int a = 100;
        int b = 0;
        try {
            System.out.println("Array elements:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            System.out.println("Accessing array element: " + numbers[2]);
            int result = a / b;
            System.out.println("Division Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index");
        }
        finally {
            System.out.println("Finally block is executed");
            System.out.println("Program execution completed");
        }
    }
}