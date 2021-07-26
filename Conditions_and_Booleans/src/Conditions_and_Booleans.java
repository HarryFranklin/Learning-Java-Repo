public class Conditions_and_Booleans {
    public static void main(String[] args) {
    
    int x = 6;
    int y = 7;
    int z = 10;
    // < > == <= >= !=, smaller than, greater than, equal to, less than or equal to, more than or equal to, not equal to

    boolean compare = x > y;
    System.out.println(compare); //prints false as x < 7

    boolean compare2 = x != y; 
    System.out.println(compare2); //true because x does not equal y

    //if variable is a string, can only do != or .equals(),                                        !!!!!     ie compare = x.equals(y).  NOT ==     !!!!!
    //ie string x = hello, string y = Hello, they != because case sensitive

    int x2 = 6;
    int y2 = 23;
    int z2 = 10;

    boolean compare3 = x2 > y2 && z < y; //&& means and, so are both true
    System.out.println(compare3); //gives me false because not both are true

    // || are or, so if one is true, whole boolean is true, if both are false, its false.
    boolean compare4 = x2 > y2 || z2 < y2;
    System.out.println(compare4); // true because at least one is true

    //not operator is !(blah), so
    boolean compare5 = !(x2 > y2 || z2 < y2);
    System.out.println(compare5); //gives false

    //can reverse a boolean
    boolean a = !(false);
    System.out.println(a); //prints true because opposite of false is true

    //can make really ott puzzles with this
    boolean compare6 = x2 < y2 && y2 > z2 || z2 + 2 < 5 || x2 + 7 > y2; //okay wtf, try brackets
    System.out.println(compare6);

    boolean compare7 = (x2 < y2 && y2 > z2) || (z2 + 2 < 5) || (x2 + 7 > y2);
    System.out.println(compare7); // apparently its true, so that means at least one of the three sections, the && or one at least 1 of the || is true...



    }
}
