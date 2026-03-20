public class Questions {
    public static void main(String[] args) {
        // 1.2.1 Suppose that a and b are int variables. What does the following
        // sequence of statements do?

        // int t = a; b = t; a = b;

        // Answer:

        // int t = a; //Initializes variable t with a
        // int b = t; //Since t = a, then b = a;
        // int a = b; //Therefore, both of these values here are equivalent with a value
        // of 'a'

        // 1.2.2 Write a program that uses Math.sin() and Math.cos() to check that the
        // value of cos2 + sin2 is approximately 1 for any angle entered as a
        // command-line argument. Just print the value. Why are the values not always
        // exactly 1?

        // Solution:
        int sinVal = Integer.parseInt(args[0]);
        int cosVal = Integer.parseInt(args[1]);

        double sum = (Math.sin(sinVal) * Math.sin(sinVal)) + (Math.cos(cosVal) * Math.cos(cosVal));

        System.out.println(sum);
        System.out.println("This is the value of sin(): " + Math.sin(sinVal));
        System.out.println("This is the value of cos(): " + Math.cos(cosVal));

        // Answer: I think this has more to do with precision rather than the resulting
        // identity itself.

        // 1.2.3 Suppose that a and b are boolean variables. Show that the (!(a && b) &&
        // (a || b)) || ((a && b) || !(a || b)) evaluates to true.
        boolean a = true;
        boolean b = false;

        boolean evaluate = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        System.out.println("Evaluating boolean expression as: " + evaluate);

        // Answer: The value for a should be true and the value for b should be false

        // 1.2.4 Suppose that a and b are int variables. Simplify the following
        // expression: (!(a && b) && (a || b)) || ((a && b) || !(a || b))

    }
}