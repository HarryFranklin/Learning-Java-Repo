import java.util.Scanner;

public class Do_While_Loops {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.print("Type a number: ");
            x = sc.nextInt(); 
        } while (x!=10); //output type a number until 10 is input
    }
}
