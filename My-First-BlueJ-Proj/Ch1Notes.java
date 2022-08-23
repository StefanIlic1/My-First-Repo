
/**
 * Stefan Ilic
 * 8/23/22
 * Chapter 1 Notes
 * desc: class notes on basic concepts
 * Who helped me: 
 */
public class Ch1Notes
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * this is our code notes
     */
    public static void main(String[] args)
    {
        //basic data types
        double number = 8.9, number2;
        int x = 9,y,z;
        boolean torf = false;
        char letter = 'b';
        float number3 = 6; // floats hold less memory
        long n2 = 56; // more storage for an int
        short n3 = 7;
        
        
        
        //these are classes; objects created instead of variables
        
        //Class
        //Name  ID   memory  constructor
        Integer n1 = new Integer(47); // wrapper class
        String word = new String("Stefan Ilic"); // not a primitive data type
        Double number4 = new Double(6.7);
        
        
        System.out.print(word.length());
    }
}
