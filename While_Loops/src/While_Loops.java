import java.util.Scanner;
public class While_Loops {
    public static void main(String[] args)  {

    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number: ");
    int x = sc.nextInt();

    int goes = 0;
    while (x != 10) { //while input isn't 10, carry on
        System.out.println("Type 10...");
        System.out.println("Type a number: ");
        x = sc.nextInt();
        goes++; //adds 1 to goes each cycle
    }
    System.out.println("You had " + goes + " tries."); //after broke out of while loop, prints number of goes

    }
}
