public class Questions {
    public static void main(String[] args) {
        // 1.1.1. Write a program that prints the "Hello, World" message 10 times.
        // Solution #1:
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");

        // Solution #2:
        for (int i = 0; i <= 9; i++) {
            System.out.println("Hello World!!!");
        }

        // 1.1.2. Describe what happens if you omit the following in HelloWorld.java
        // a. public = When removed, this shows a run-time error that the main method
        // cannot be found, and shows the correct usage: public static void
        // main(String[] args)
        // b. static = When removed, this shows another run-time error that main method
        // is not static, and again shows the correct usage: public static void
        // main(String[] args)
        // c. void = When removed, this shows a compile-time error, saying that the
        // return type is required and an approximate location of where the offending
        // part is
        // d. args = When removed, this shows a compile-time error, saying that an
        // identifier is expected and an approximate location of where the offending
        // part is

        // 1.1.3. Describe what happens if you misspell the following in HelloWorld.java
        // a. public = When misspelled, this shows a compile-time error and an
        // approximate location of the offending word
        // b. static = When misspelled, this shows a compile-time error and an
        // approximate location of the offending word; and additionally another error
        // for not having a valid return type
        // c. void = When misspelled, this shows a compile-time error with offending
        // word and the specific class where the offending word is located
        // d. args = When misspelled, nothing really happened as this is a variable name

        // 1.1.4. Describe what happens if you put the double quotes in the print
        // statement of HelloWorld.java on different lines, as in this code fragment:
        // When the print statements in between the quote marks are placed in different
        // lines, a compile-time error shows exactly 4 errors (unclosed string literal,
        // the expected ';' and not a statement)

        // 1.1.5. Describe what happens if you try to execute UseArgument with each of
        // the following command lines
        // java UseArgument java = The program simply takes the argument as is and
        // displays it for greeting during run-time.
        // java UseArgument @!&^% = The program throws a ParserError, highlighting the
        // incorrect use of the "&" because of its special reservation; however,
        // wrapping the input in "" allows the program to safely accept this as a valid
        // argument.
        // java UseArgument 1234 = The program also simply takes the input as a valid
        // argument and displays it for greeting during run-time.
        // java UseArgument.java Bob = The program also simply takes the input as a
        // valid argument and displays it for greeting during run-time.
        // java UseArgument Alice Bob = The program only accepts the first argument as a
        // valid input and ignores the second argument value.

        // 1.1.6. Modify UseArgument.java to make a program UseThree.java that takes
        // three names as command-line arguments and prints a proper sentence with the
        // names in the reverse of the order given, so that, for example, java UseThree
        // Alice Bob Carol prints Hi Carol, Bob, and Alice.
    }
}