package String;

public class StringMethod {
    public static void main(String[] args) {
        String str = "Java string pool to collection of string which is stored in heap memory";

        String str1 = str.toLowerCase();

        System.out.println("In Lower Case : " + str1);

        String str2 = str.toUpperCase();

        System.out.println("In Upper Case :" + str2);

        String str3 = str.replace('a', '$');

        System.out.println("a Replaced With $ :" + str3);

        boolean str4 = str.contains("collection");

        System.out.println(str4);

        String str5 = "java string pool to collection of string which is stored in heap memory";

        System.out.println(str == str5);

        System.out.println(str.equalsIgnoreCase(str5));

    }
}