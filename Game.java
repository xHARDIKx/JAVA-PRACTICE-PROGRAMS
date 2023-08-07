public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("HARDIK");
        player1.displayPlayerInfo();
    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("This is the Person class");
    }
}

class Player extends Person {
    int score;

    public Player(String name) {
        super(name);
        score = 0;
    }

    public void displayPlayerInfo() {
        System.out.println("Player name: " + super.name);
        System.out.println("Player score: " + score);
        super.displayInfo();
    }
}
