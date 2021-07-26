public class For_Loops {
    public static void main(String[] args)  {
        //   start       finish   instruction
        for (int i = 0; i <= 10; i++) {
            // i is increment, ++ for +1 per time loop is ran
            // i+=5 for add five each time
            // loop will run while i <= to 10
            System.out.println(i); // output 1 2 3 4 5 etc until 10

        }

        int[] arr = {1,5,7,3,4,5};
        for (int x = 0; x <arr.length ; x++){
            if (arr[x] == 5) {
                System.out.println("A 5 is in the array."); //prints twice because 2 are present
                System.out.print("  The 5 is at index" + x + ".  "); //prints value of x where the value is present
            }
        }
    }

}
