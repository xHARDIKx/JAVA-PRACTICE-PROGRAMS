
    

public class stat_meth {
    public static void main(String[] args) {
        int number = 3;
        int cube = calculateCube(number);
        System.out.println("Cube of " + number + " is " + cube);
    }

    public static int calculateCube(int num) {
        return num * num * num;
    }
}
