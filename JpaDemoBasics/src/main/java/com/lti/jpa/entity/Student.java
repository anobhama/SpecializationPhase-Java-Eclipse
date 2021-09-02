package com.lti.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//telling the jpa that is a entity(table)
@Entity 
@Table(name="STUDENTS")  //giving name to the table 

public class Student {

	@Id  //primary key indication
	@Column(name="STUDENT_ID")
	
	/*//auto generated
	@GeneratedValue(strategy = GenerationType.AUTO) */
	
	//created a sequence in oracle 
	/*create sequence Stu_Seq increment by 1 start with 1000   // database object
	select Stu_Seq.nextval from dual
	select Stu_Seq.currval from dual
	insert into students values(Stu_Seq.nextval,'Asu',95);
	*/
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HB_STU_SEQ")
	@SequenceGenerator(name = "HB_STU_SEQ", sequenceName = "Stu_Seq", allocationSize = 1)
	private int studentId;
	
	@Column(name="STUDENT_Name")
	private String studentName;
	
	@Column(name="STUDENT_Score")
	private double studentScore;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, double studentScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	public Student(String studentName, double studentScore) {
		super();
		this.studentName = studentName;
		this.studentScore = studentScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentScore() {
		return studentScore;
	}

	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentScore=" + studentScore
				+ "]";
	}
		
}
