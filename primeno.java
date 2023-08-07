import java.util.Scanner;
public class primeno{ public static void main(String[] args) {
Scanner scanner = new Scanner(System.in); System.out.print("Prime Numbers till? "); int till = Integer.parseInt(scanner.nextLine());
for(int i=1; i <=till; i++){ if(isPrime(i)) {
System.out.print(i + " ");
}
} } static boolean isPrime(int n) { if(n==1||n==0) return false;
for(int i = 2; i < n; i++){ if(n%i==0) return false;
} return true;
}
}
