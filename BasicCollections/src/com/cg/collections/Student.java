package com.cg.collections;

//.....Student class implements Comparable
//overiddes compareTo function

public class Student implements Comparable<Student>{
	String name;
	int u_id;
	
	
	public Student(int u_id, String name) {
		super();
		this.name = name;
		this.u_id = u_id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", u_id=" + u_id +"]";
	}

//...Compares name of the student
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		
		return (name.compareTo(student.name));
	}

	
	
	
}
