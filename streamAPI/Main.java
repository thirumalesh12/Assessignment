package sterms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> al = new ArrayList<Fruit>();
        al.add(new Fruit("apple", 150, 50, "red"));
        al.add(new Fruit("banana", 200, 30, "yellow"));
        al.add(new Fruit("grapes", 70, 40, "purple"));
        al.add(new Fruit("guava", 60, 20, "green"));

        List<Fruit> sortedList = al.stream().filter((e) -> e.getCalories() < 100)
                .sorted(Comparator.comparing(Fruit::getCalories)).collect(Collectors.toList());
        System.out.println(sortedList);
        List<Fruit> listByColor = al.stream().sorted(Comparator.comparing(Fruit::getColor))
                .collect(Collectors.toList());
        System.out.println(listByColor);
        List<Fruit> redColorFru = al.stream().filter((e) -> e.getColor() == "red").collect(Collectors.toList());
        System.out.println(redColorFru);
        System.out.println("*******************************");
        ArrayList<News> news = new ArrayList<News>();
        news.add(new News(1, "mani", "mani", "good budget"));
        news.add(new News(2, "ravi", "ravi", "not bad,really good"));
        news.add(new News(3, "raju", "raju", "too bad and must be improved budget"));
        news.add(new News(4, "kiran", "kiran", "very good budget"));
        news.add(new News(5, "omkar", "omkar", "need to improve the content"));

        long count = news.stream().filter((e) -> e.getComment().contains("budget")).count();
        System.out.println("The Count of budget in the comments is " + count);
        
        System.out.println("**********************************");
        ArrayList<Transaction> transList = new ArrayList<Transaction>();
        transList.add(new Transaction(new Trader("ravi", "bangalore"), 2010, 5000));
        transList.add(new Transaction(new Trader("raju", "Mumbai"), 2011, 15000));
        transList.add(new Transaction(new Trader("omkar", "Delhi"), 2012, 10000));
        transList.add(new Transaction(new Trader("mani", "pune"), 2011, 20000));
        transList.add(new Transaction(new Trader("kiran", "bangalore"), 2013, 25000));
        transList.add(new Transaction(new Trader("madhu", "pune"), 2014, 5000));
        transList.add(new Transaction(new Trader("ramya", "pune"), 2015, 15000));
        List<Transaction> sortedListByValue = transList.stream().filter((e) -> e.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
        System.out.println(sortedListByValue);
        List<String> cities = transList.stream().map((e) -> e.getTrader().getCity()).distinct()
                .collect(Collectors.toList());
        System.out.println(cities);
        List<Transaction> sortingByName = transList.stream().filter((e) -> e.getTrader().getCity() == "pune")
                .collect(Collectors.toList());
        System.out.println(sortingByName);
        // List<Trader>
        // sortingByNameInAlph=transList.stream().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        List<Transaction> delhiList = transList.stream().filter((e) -> e.getTrader().getCity() == "Delhi")
                .collect(Collectors.toList());
        System.out.println(delhiList);
        // transList.stream().map((e)->e.getValue()).forEach(System.out::println);
        int max = transList.stream().map((e) -> e.getValue()).max(Integer::compare).get();
        System.out.println("max value is " + max);
        int min = transList.stream().map((e) -> e.getValue()).min(Integer::compare).get();
        System.out.println("Min value is " + min);
    }
}