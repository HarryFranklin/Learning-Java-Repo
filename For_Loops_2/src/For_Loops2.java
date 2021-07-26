import java.util.Scanner;
public class For_Loops2 {
    public static void main(String[] args) {
  
        int[] arr = {1,5,7,3,4,5};
        String[] names = new String [5];
        
        int count = 0;
        for (int element:arr) { //this way auto goes from start to finish
            System.out.println(element + " " + count); //prints out values in array start to finish // count means it prints the index of each element next to the value
            count++; //count keeps track of element
       //known as for each
        }
       Scanner sc = new Scanner (System.in);
        for (int i = 0;i < names.length; i++) { //counts i up to 5 as array is 5 long
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        
        }

        for (String n:names) {
            System.out.println(n); //prints values from input

        //breaking out of the loop under a condition
        // break;
        if (n.equals("tim")) {
            break; //prints all values enetered up to and including "tim"
        }
        }
    
    }


}
