package mypackagecollection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentService {
	private List<Student> studentlist;
	private Scanner sc;

	public StudentService() {
		sc = new Scanner(System.in);
		studentlist = new ArrayList<>();
	}

	public void insertStudent() {
		System.out.println("How many students u want to have");
		int noofstudent = sc.nextInt();
      for(int x=1; x<=noofstudent;x++) {
	Student s = new Student();
	System.out.println("Enter student id");
      s.setStudentid(sc.nextInt());
      System.out.println("Enter student name");
     s.setStudentname(sc.next());
     System.out.println("Enter score");
     s.setScore(sc.nextInt());
              //studentlist.add(s);
}
}
public void  display() {
	for(Student s1:studentlist){
		System.out.println("Student name is" + s1.getStudentname());
		System.out.println("Student score is" + s1.getScore());
	}
}
	public void  delete() {
		System.out.println("enter student id which u want to delete");
		int studentid= sc.nextInt();
		Student sdelete=null;
		for(Student s:studentlist){
			if(s.getStudentid()==studentid) {
		}
			 sdelete=s;
		
		}	
		
		}
		public void  update() {
			System.out.println("enter student id which u want to update");
			int studentid= sc.nextInt();
			Student supdate= null;
			for(Student s:studentlist) {
				if(s.getStudentid()==studentid) {
					System.out.println("Enter new score");
					s.setScore(sc.nextInt());
				}
			}
		}
		public void menu() {
			String choice="y";
			while(choice.equals("y")) {
			System.out.println("1.Insert student");
			System.out.println("2.Update student");
			System.out.println("3.Delete student");
			System.out.println("View student");
			
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1:
				insertStudent();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
				
			case 4:
				display();
				break;
			}
			System.out.println("Do u want to continue");
			choice =sc.next();
		}
}
	

	public static void main(String[]args) {
		StudentService sservice= new StudentService();
		    sservice.menu();
		    //sservice.insertStudent();
		    //sservice.display();
		    //sservice.delete();
		    //sservice.update();
	}
}