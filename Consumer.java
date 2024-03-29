//Consumer represents an operation which takes an argument and returns nothing.
//Use this functional interface If you want to compose a lambda expression which performs some operations on an object.



package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Student
{
    int id;
     
    String name;
     
    double percentage;
     
    String specialization;
     
    public Student(int id, String name, double percentage, String specialization) 
    {
        this.id = id;
         
        this.name = name;
         
        this.percentage = percentage;
         
        this.specialization = specialization;
    }
     
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public double getPercentage() {
        return percentage;
    }
 
    public String getSpecialization() {
        return specialization;
    }
 
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }
}
public class Test {
	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));        
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));         
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));         
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));         
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));         
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));         
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));         
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));		         
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));         
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
//		Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
//        
//		List<Student> mathematicsStudents = new ArrayList<Student>();
//		         
//		for (Student student : listOfStudents) 
//		{
//		    if (mathematicsPredicate.test(student)) 
//		    {
//		        mathematicsStudents.add(student);
//		    }
//		}
//		for (Student s1:mathematicsStudents) {
//			System.out.println(s1);
//		}
		Consumer<Student> percentageConsumer = (Student student) -> {
	        System.out.println(student.getName()+" : "+student.getPercentage());
	    };
	         
	for (Student student : listOfStudents) 
	{
	    percentageConsumer.accept(student);
	}
		
	}
	
	

}
