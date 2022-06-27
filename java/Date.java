package collection;

import java.util.LinkedList;

public class Date {
    public Date date;

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("29-09-1998");
        l.add("12-12-1988");
        l.add("07-06-1993");
        l.add("19-04-1995");
        l.add("02-06-1990");

        System.out.println();

        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i).toString();
            String[] s1 = s.split("-");
            int year = Integer.parseInt(s1[2]);

            if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
                System.out.println("The date is " + l.get(i) + " is a leap year");
            } else
                System.out.println("The date is " + l.get(i) + " is a not leap year");
        }
    }
}
