import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a number to be cubed: ");
    	int num = scanner.nextInt();
    	System.out.println("Cube of " + num + " is " + Cube.cube(num));
	}
}

 class Cube {
	public static int cube(int num) {
    	return num * num * num;
	}
}
