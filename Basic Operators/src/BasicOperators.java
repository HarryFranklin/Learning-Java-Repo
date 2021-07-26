public class BasicOperators {
    public static void main(String[] args) throws Exception {
        
        int x; //declared but not initialised
        x = 6; //sets x as 6 as expected
        System.out.println(x); //prints value of x

        char z;
        z = 'f';
        System.out.println(z);

        int a = 10;
        int b = 9;
        int c = 4;
        int sum = a + b + c; //sets sum as an integer = to a + b + c
        //could do int sub = a - b - c etc

        System.out.println(sum);

        int product = a * b * c; //for multiplication
        System.out.println(product); 

        //follows BIDMAS

        int test = a * b - c;
        System.out.println(test); //should be 86

        int bracket_test = (a*b)/c;
        System.out.println(bracket_test); //does brackets then divides by c
        //system.out is 22 as its an int, not float

        int divide = a / c;
        System.out.println(divide); //same as above, gives us 2, not 2.5
        float divide2 = a / c;
        System.out.println(divide2); //prints 2.0, because data being used comes from integers


        double a2 = 10;
        double c2 = 4;
        double divide_double = a2 / c2; //will print exact value, 2.5
        System.out.println(divide_double);
        //if at least one of the variables is a double, the result will also be a double

        double d = Math.pow(a, c); //so raise a to the c // Math.pow must be double
        System.out.println(d); //prints d (a to the c)

        //typecasting

        int q = 5;
        int w = 7;
        double u = q / (double)w; // changes w to a double in line so don't have to alter the variables at the start

        System.out.println(u); //returns a double

    }
}
