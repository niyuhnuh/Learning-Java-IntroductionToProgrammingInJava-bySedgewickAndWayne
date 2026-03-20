public class Ruler {
    public static void main(String[] args) {
        String ruler1 = "1";
        String ruler2 = ruler1 + " 2 " + ruler1;
        String ruler3 = ruler2 + " 3 " + ruler2;
        String ruler4 = ruler3 + " 4 " + ruler3;

        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);

        // Java immediately converts the other value of the operand into a String when
        // one of the other operands is alr a String
        String a = "1234";
        int b = 99;
        String c = a + b;

        System.out.println("This is the value of c: " + c);

        // Trying to parse values as input arguments
        // Note: When the values assigned to a specific data type are not compatible, a
        // compile-time error "incompatible types" will be displayed during a compile
        // attempt

        // int val = Integer.parseInt(args[0]);
        // System.out.println("This value: " + val + " is of the int data type.");
        // System.out.println("Adding 200 to the first value is equal to: " + (val +
        // 200));

        // String val = args[0];
        // System.out.println("This value: " + val + " is of the String data type.");
        // System.out.println("Adding 200 to the first value is equal to: " + (val +
        // 200));

        float val = Float.parseFloat(args[0]);
        System.out.println("This value: " + val + " is of the float data type.");
        System.out.println("Adding 200 to the first value is equal to: " + (val + 200));

    }
}