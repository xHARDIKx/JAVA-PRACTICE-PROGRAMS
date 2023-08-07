import java.util.Scanner;
public class strn { public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String userString = scanner.nextLine();
System.out.println("Length of String " + userString + " is: " + userString.length());
System.out.print("Enter the index for which you want index for:	"); int userIndex = Integer.parseInt(scanner.nextLine());
System.out.println("Character at " + userIndex + " in " + userString + " is" + userString.charAt(userIndex));
System.out.println(userString.replace("R", "T")); }
}
