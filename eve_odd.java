public class eve_odd {
    
        public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        if(userInput % 2== 0) {
        System.out.println(userInput + " is an even number");
        } else {
        System.out.println(userInput + " is a odd number");
        }
        } 
    }