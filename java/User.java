package collection;

import java.util.Scanner;
import java.util.TreeSet;

public class User {
public static void main(String[] args) {
	System.out.println("1.Id");
	System.out.println("2.Name");
	System.out.println("3.Department");
	System.out.println("4.Salary");
	Scanner sc=new Scanner(System.in);
	System.out.println("Type Your option");

	String str = sc.nextLine();

	if(str.equals("Id")) {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortById());
		ts.add(new Employee(4,"mani","Hr",22000));
		ts.add(new Employee(9,"omkar", "Accounting", 33000));
		ts.add(new Employee(3,"amit","Development",26000));
		ts.add(new Employee(1,"smit","Accounting",45000));
		ts.add(new Employee(5,"mahendra", "Testing", 54000));
		ts.add(new Employee(6,"kunal","Hr",37000));
		ts.add(new Employee(7,"shrey", "Development", 44000));
		ts.add(new Employee(8,"ketki","Accounting",22000));
		ts.add(new Employee(2,"aniket","Testing",31000));
		ts.add(new Employee(10,"sanket", "Hr", 39000));
		
		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Name")) {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortByName());
		ts.add(new Employee(4,"mani","Hr",22000));
		ts.add(new Employee(9,"omkar", "Accounting", 33000));
		ts.add(new Employee(3,"amit","Development",26000));
		ts.add(new Employee(1,"smit","Accounting",45000));
		ts.add(new Employee(5,"mahendra", "Testing", 54000));
		ts.add(new Employee(6,"kunal","Hr",37000));
		ts.add(new Employee(7,"shrey", "Development", 44000));
		ts.add(new Employee(8,"ketki","Accounting",22000));
		ts.add(new Employee(2,"aniket","Testing",31000));
		ts.add(new Employee(10,"sanket", "Hr", 39000));

		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Department")) {
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortByDept());
		ts.add(new Employee(4,"mani","Hr",22000));
		ts.add(new Employee(9,"omkar", "Accounting", 33000));
		ts.add(new Employee(3,"amit","Development",26000));
		ts.add(new Employee(1,"smit","Accounting",45000));
		ts.add(new Employee(5,"mahendra", "Testing", 54000));
		ts.add(new Employee(6,"kunal","Hr",37000));
		ts.add(new Employee(7,"shrey", "Development", 44000));
		ts.add(new Employee(8,"ketki","Accounting",22000));
		ts.add(new Employee(2,"aniket","Testing",31000));
		ts.add(new Employee(10,"sanket", "Hr", 39000));

		for(Employee e:ts) {
			System.out.println(e);
		}
	}
	else if(str.equals("Salary")) 
	{
		TreeSet<Employee> ts= new TreeSet<Employee>(new SortBySal());
		ts.add(new Employee(4,"mani","Hr",22000));
		ts.add(new Employee(9,"omkar", "Accounting", 33000));
		ts.add(new Employee(3,"amit","Development",26000));
		ts.add(new Employee(1,"smit","Accounting",45000));
		ts.add(new Employee(5,"mahendra", "Testing", 54000));
		ts.add(new Employee(6,"kunal","Hr",37000));
		ts.add(new Employee(7,"shrey", "Development", 44000));
		ts.add(new Employee(8,"ketki","Accounting",22000));
		ts.add(new Employee(2,"aniket","Testing",31000));
		ts.add(new Employee(10,"sanket", "Hr", 39000));

		for(Employee e:ts) {
			System.out.println(e);
		}
	}
}
}
