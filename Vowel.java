import java.util.Scanner;
public class Vowel { public static void main(String[] args) { Scanner scanner = new Scanner(System.in); System.out.print("Enter an alphabet : ");
String input = scanner.nextLine(); switch (input.toLowerCase()) { case "a": case "e": case "i": case "o": case "u":
{
System.out.println(input + " is a vowel."); break; }
default:
System.out.println(input + " is not a vowel.");
}
}
}
