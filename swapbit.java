import java.util.Scanner;
public class swapbit {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); System.out.print("Enter first number: "); int num1 = Integer.parseInt(scanner.nextLine());
System.out.print("Enter second number: "); int num2 = Integer.parseInt(scanner.nextLine());
System.out.println("Before swapping");
System.out.println("First number = " + num1 +"\nSecond Number = " + num2);
num1 = num1 ^ num2; num2 = num1 ^ num2; num1 = num1 ^ num2;
System.out.println("After swapping");
System.out.println("First number = " + num1 +"\nSecond Number = " + num2);
}
}
