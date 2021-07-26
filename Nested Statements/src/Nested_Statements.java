import java.util.Scanner;

public class Nested_Statements {
    public static void main(String[] args) {
        
    System.out.print("Input your age:");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int age = Integer.parseInt(s); //converts age into int

    if (age >= 18) {
        System.out.println("You are an adult");

        System.out.println("Input your fav food"); //this is the nested statement, a condition within a if statement 
        String food = sc.nextLine();
        if (food.equals("Pizza")) {
            System.out.println("Mine too");
        }
        else {
            System.out.println("Not mine");
        }
    }
    else if (age >= 13) {
        System.out.println("You are a teenager");
    }
    else {
        System.out.println("You are a pre-teen"); //outputs this for any number below 13

    }
    }
}
