import java.util.Scanner;
public class If_Else_and_Else_If {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();

    if (s.equals("tim")) { //if variable from scanner is tim, code in the {} will be executed
            System.out.println("You typed tim"); //if tim is the input, executed the println, else, does nothing as no code.
        
        }
       System.out.println("Print"); //executed after the if regardlesss of the if result because not in the if {}

    if (s.equals("tim")) {
        System.out.println("You typed tim");
    }
    else { 
        System.out.println("You did not type tim"); //if not tim, output this.

    }

    //put else if between if and else
    if (s.equals ("tim")) {
        System.out.println("you typed tim");
    }
    else if (s.equals("hello")) { //if receives hello, prints hi and ignores the if....
        System.out.println("hi");

    //else blah blah

    }

    }

    }
