import java.util.Scanner;

public class avergarray {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[4];
        for(int i = 0; i < 4; i++) {
        System.out.print("enter element " + (i + 1) + ": ");
        numArray[i] = Integer.parseInt(scanner.nextLine());
        } 
        double sum = 0.0;
        for (int i : numArray) {
        sum += i;
        }
        double avg = sum / numArray.length;
        System.out.println("Average of array is: " + avg);
        } }