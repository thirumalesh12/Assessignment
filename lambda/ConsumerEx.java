package com.corejava.lambdaexpression.functionalinterfaceQ3;

import java.util.ArrayList;
import java.util.function.Consumer;

class Person{
	private int age;
	private String name;
	private String work;
	public Person(int age,String name, String work) {
		 this.age=age;
		this.name=name;
	 this.work=work;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
}


public class ConsumerEx {

	public static void main(String[] args) {
		ArrayList<Person>al=new ArrayList<Person>();
		Person p1=new Person(24,"yogesh","analyst");
		Person p2=new Person(21,"aniket","cashier");
		Person p3=new Person(19,"katrina","hr");
		Person p4=new Person(22,"nilesh","tester");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		Consumer <Person> consumer=(Person p)->{
			System.out.println("name : "+p.getName()+" ");
			System.out.println("age : "+p.getAge()+" ");
			System.out.println("work : "+p.getWork());
	
		};
		
		Consumer <Person> consumer1=(Person p)->{
			if(p.getAge()<20) {
			System.out.println("age : "+p.getAge()+" "+"name :"+p.getName());
			}
		};
		for(Person p:al) {
			//consumer.accept(p);
			consumer.andThen(consumer1).accept(p);
		}

	}

}
