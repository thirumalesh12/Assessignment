package collection;

import java.util.Comparator;

public class Employee {
private int id;
private String name;
private String department;
private int salary;

public Employee(int id, String name, String department, int salary) {
super();
this.id = id;
this.name = name;
this.department = department;
this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
}
}
class SortBySal implements Comparator<Employee>{

@Override
public int compare(Employee o1, Employee o2) {
	return o1.getSalary()-o2.getSalary();
}
}
class SortByName implements Comparator<Employee>{

@Override
public int compare(Employee o1,Employee o2) {
	
	return o1.getName().compareTo(o2.getName());
}
}
class SortByDept implements Comparator<Employee>{

@Override
public int compare(Employee o1, Employee o2) {
	
	return o1.getDepartment().compareTo(o2.getDepartment());
}
}
class SortById implements Comparator<Employee>{

@Override
public int compare(Employee o1, Employee o2) {
	
	return o1.getId()-o2.getId();
}
}
