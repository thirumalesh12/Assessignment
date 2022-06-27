package String;

public class StringInsert {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("it is used to at the specified index posotion");

        System.out.println("Original String :" + buffer);

        buffer.insert(10, " insert text");

        System.out.println("After Inserting text :" + buffer);

        StringBuffer buffer1 = new StringBuffer("This method return the reversed object on which it was called");

        System.out.println("Original String :" + buffer1);

        buffer1.reverse();

        System.out.println("Reversed String :" + buffer1);
    }
}
