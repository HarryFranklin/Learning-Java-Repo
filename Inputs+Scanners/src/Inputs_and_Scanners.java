import java.util.Scanner;
public class Inputs_and_Scanners {
    public static void main(String[] args) {

        int x = 56 % 5; //% modulus, gives remainder.
        System.out.println(x); //gives 1

        Scanner sc = new Scanner(System.in);
        String scanned = sc.next(); //only for String
        System.out.println(scanned); //prints value from scanner
        
        Scanner sc2 = new Scanner(System.in);
        int scanned2 = sc2.nextInt();
        System.out.println(scanned2); //prints integer

        // always use string (sc.next) so any input works
        // if a string is -> scanned int, it won't work

    }
}
