package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name is Hema ");
	}
	public void studentDept()
	{
		System.out.println("Student Dept is EEE ");
	}
	public void studentId()
	{
		System.out.println("Student ID is 123 ");
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentDept();
		std.studentId();
		std.studentName();
		
	}

}
