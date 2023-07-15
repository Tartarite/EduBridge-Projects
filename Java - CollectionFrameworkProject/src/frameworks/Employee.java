package frameworks;

import java.util.Scanner;

public class Employee{
	int eid,age,salary;
	String eFname;
	String eLname;
	String dept;
	String position;
	public Employee() {
		this.eid = 0;
		this.age = 0;
		this.salary = 0;
		this.eFname = "";
		this.eLname = "";
		this.dept = "";
		this.position = "";
	}
		
	public int getEid() {
		return eid;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String geteFname() {
		return eFname;
	}

	public String geteLname() {
		return eLname;
	}

	public String getDept() {
		return dept;
	}

	public String getPosition() {
		return position;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void seteFname(String eFname) {
		this.eFname = eFname;
	}

	public void seteLname(String eLname) {
		this.eLname = eLname;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public void setDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		this.setEid(sc.nextInt());
		System.out.println("Enter first name: ");
		this.seteFname(sc.next());
		System.out.println("Enter last name: ");
		this.seteLname(sc.next());
		System.out.println("Enter age: ");
		this.setAge(sc.nextInt());
		System.out.println("Enter department name: ");
		this.setDept(sc.next());
		System.out.println("Enter position: ");
		this.setPosition(sc.next());
		System.out.println("Enter Salary: ");
		this.setSalary(sc.nextInt());
		System.out.println("Thank you for entering the details, the employee has been added");
		
	}
	public void displayDetails() {
		
		System.out.println("Employee id: "+ this.getEid());		
		System.out.println("First name: "+ this.geteFname());	
		System.out.println("Last name: "+ this.geteLname());
		System.out.println("Age: "+ this.getAge());		
		System.out.println("Department: "+ this.getDept());		
		System.out.println("Position: "+ this.getPosition());
		System.out.println("Salary: "+ this.getSalary());
		
	}
	
	

}