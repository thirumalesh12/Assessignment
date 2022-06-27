package String;

public class StringBuilder {
    public StringBuilder(String string) {
    }
    public static void main(String[] args) {

        System.out.println("{ Question 1 }");

        StringBuilder str = new StringBuilder("String Buffer");

        System.out.println("Original String :" + str);
        str.append("is a peer class of string");

        System.out.println("using Append method" + str);

        str.append("that provides much of");

        System.out.println(str);

        str.append(" the functionality of string");
        System.out.println(str);

        System.out.println("{ Question 2 }");

        StringBuilder builder = new StringBuilder("it is used to at the specified index posotion");

        System.out.println("Original String :" + builder);

        builder.insert(10, " insert text");

        System.out.println("After Inserting text :" + builder);

        System.out.println("{ Question 3 }");

        StringBuilder builder1 = new StringBuilder("This method return the reversed object on which it was called");

        System.out.println("Original String :" + builder1);

        builder1.reverse();

        System.out.println("Reversed String :" + builder1);

    }

    private void reverse() {
    }

    private void insert(int i, String string) {
    }

    private void append(String string) {
    }
}