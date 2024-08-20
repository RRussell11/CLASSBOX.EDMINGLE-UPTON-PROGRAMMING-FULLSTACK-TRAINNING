package streampckge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StudentDetails {
	private String name;
	private int marks;

	public StudentDetails(String name, int marks) {
		this.name = name;
		this.marks = marks;

	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", marks=" + marks + "]";
	}

}

public class Student {

	public static void main(String[]args) {
	
List<StudentDetails>students= new ArrayList<>();

		 students.add(new StudentDetails("Alice", 85));
		 students.add(new StudentDetails("John", 80));
		 students.add(new StudentDetails("Bob", 95));
		 students.add(new StudentDetails("Charlie", 55));
		 students.add(new StudentDetails("Eve", 60));
		 
		 //List.Stream-- methods : Filter,Sort,Collect
		 
		 List<StudentDetails>filteredAndSortedStudents= students.stream()
	                                             .filter(StudentDetail->StudentDetail.getMarks() >75)
                    
	                                             .sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
	                                             .collect(Collectors.toList());
	                                             
     System.out.println("Students with marks greater than 75, sorted by name:"); 
	                                            
     filteredAndSortedStudents.forEach(System.out::println);
	}
}
