public class UseThree{
    public static void main(String[] args){
        String lastName = args[0];
        String middleName = args[1];
        String firstName = args[2];

        System.out.print("Hi, ");
        System.out.print(firstName + ", ");
        System.out.print(middleName + ", ");
        System.out.print(lastName);
        System.out.print(". How are you?");
    }
}