public class IntOps{
    public static void main(String[] args){

        //Byte data type
            //During compilation, the operations listed here produce an error (incompatible types: possible lossy conversion from int to byte, which meant that there is a possibility of losing a value through this conversion)
            //Byte data type is able to handle values from -128 to 127
            //According to research, this is because Java automatically promotes this data type to a larger one
            // byte -> short -> int > long -> float -> double

        /*byte a = Byte.parseByte(args[0]);
        byte b = Byte.parseByte(args[1]);
        byte p = a * b; // here
        byte q = a / b; //here
        byte r = a % b; //here */

        //To remedy the earlier possible incompatibility, assigning a bigger data type than the previously assigned data type solves the compile-time error.
        short a = Short.parseShort(args[0]);
        short b = Short.parseShort(args[1]);
        int p = a * b; // here
        int q = a / b; //here
        int r = a % b; //here


        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q);
        System.out.println(a + " % " + b + " = " + r);

    }
}