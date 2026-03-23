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

        // Answer:

        // 1.2.5 The exclusive or operator ^ for boolean operands is defined to be true
        // if they are different, false if they are the same. Give a truth table for
        // this function.

        // Answer:

        // 1.2.6 Why does 10/3 give 3 and not 3.333333333?
        // Answer: Since 10 and 3 are both integer values, Java does not emphasize the
        // other values due to the automatic implicit type conversion

        // 1.2.7 What does each of the following statements print?

        // a. System.out.println(2 + "bc");
        System.out.println(2 + "bc");

        // Answer: This function simply concatenates both values together. This follows
        // Java's data type special rules for String, wherein values are automatically
        // converted to a String if a String literal is one of the operands.

        // b.System.out.println(2 + 3 + "bc");
        System.out.println(2 + 3 + "bc");

        // Answer: This function first performs the addition on the two integer literals
        // due to Java's internal left associativity and then concatenates that sum to
        // the String literal and printing it to the console.

        // c.System.out.println((2 + 3) + "bc");
        System.out.println((2 + 3) + "bc");

        // Answer: This function basically performs the same process as the one before.

        // d.System.out.println("bc" + (2 + 3));
        System.out.println("bc" + (2 + 3));

        // Answer: This function first resolves the inner integer operation between the
        // literals 2 and 3 however, it firstly prints the string literal before
        // displaying the resulting value of the operation.

        // e.System.out.println("bc" + 2 + 3);
        System.out.println("bc" + 2 + 3);

        // Answer: This function recognizes the first literal as a string and then
        // therefore converts the succeeding literals as strings, and without the inner
        // parentheses indicative of their grouping, the function call just displays the
        // concatenation of the the three ltierals as strings.

        // 1.2.8 Explain how to use PROGRAM 1.2.3 to find the square root of a number.

        // Answer: This question refers to using the Quadratic.java program to find the
        // square root of the number. The suggested refactor goes as to removing the
        // unnecessary operations that were done in the previous lecture, retrieve an
        // input from the user, and use the Math.sqrt() function call on that input.
        // Lastly, call a print statement to display the result.

        int arg = Integer.parseInt(args[0]);

        double sqrt = Math.sqrt(arg);

        System.err.println("This is the square root of the first input argument: " + sqrt);

        // 1.2.9 What does each of the following print?

        // a.System.out.println('b');
        System.out.println('b');

        // Answer: The aforementioned print statement displays the character b into the
        // console.

        // b.System.out.println('b' + 'c');
        System.out.println('b' + 'c');

        // Answer: This print statement takes the internal Unicode values of the
        // characters and concatenates them together through the "+" operation.

        // c.System.out.println((char) ('a' + 4));
        System.out.println((char) ('a' + 4));

        // Answer: This print statement casts a type conversion to the internal
        // grouping, taking the char value of the summation of the integer literal 4's
        // char value and the Unicode value of char a

        // 1.2.10 Suppose that a variable a is declared as int a = 2147483647 (or
        // equivalently, Integer.MAX_VALUE). What does each of the following print?

        int aa = 2147483647;

        // a.System.out.println(a);
        System.out.println(aa);
        // Answer:

        // b.System.out.println(a + 1);
        System.out.println(aa + 1);

        // c.System.out.println(2 - a);
        System.out.println(2 - aa);

        // d.System.out.println(-2 - a);
        System.out.println(-2 - aa);

        // e.System.out.println(2 * a);
        System.out.println(2 * aa);

        // f.System.out.println(4 * a);
        System.out.println(4 * aa);

    }
}