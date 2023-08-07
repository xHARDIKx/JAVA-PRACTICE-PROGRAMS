class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class example {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void throwException() throws CustomException {
        int num = 10;
        try {
            // Example of ArithmeticException
            int result = num / 0;
        } catch (ArithmeticException e) {
            throw new CustomException("ArithmeticException occurred");
        } finally {
            // Example of ArrayIndexOutOfBoundsException
            int[] array = new int[3];
            array[5] = 10;
        }
    }
}
