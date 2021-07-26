public class Arrays {
    public static void main(String[] args) {

    // METHOD 1

        String[] newArr = new String[5]; //string so declare all items in array are strings, bit in [] is number of values
        //values of array are initialised but empty
        //index represents position of value in array
        // last position is always length of array - 1 as start at 0
        newArr[0] = "A";
        newArr[1] = "B";
        newArr[2] = "C"; //set values to A -> E
        newArr[3] = "D";
        newArr[4] = "E";

        String x = newArr[1];
        System.out.println(x); //prints value of position 2

    // METHOD 2

        int[] nums = {2,3,54,6,6};
        int y = nums[4];
        System.out.println(y); //prints value of position 5

// --------------------------------------------------------------------------------------------

        double[] decimal = {1.0, 2.3, 5.3};
        double z = decimal[2];
        System.out.println(z); //prints value of position 3
    }

}
