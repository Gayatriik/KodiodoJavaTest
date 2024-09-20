package Drive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int roll;
    String name;
    int marks;
   

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
       
        
    }

    @Override
    public String toString(){
        return "Roll: " + roll + ", Name: " + name + ", Marks: " + marks;
    }
}
public class q1{

    public static void main(String[] args){
    
        ArrayList<Student> students = new ArrayList<>();

      
        students.add(new Student(1, "Riya", 85));
        students.add(new Student(2, "Jack", 92));
        students.add(new Student(3, "Thor", 78));
        students.add(new Student(4, "Sam", 95));
        students.add(new Student(5, "Dev", 88));
        students.add(new Student(6, "gargi", 99));
        students.add(new Student(7, "Smith", 89));
        students.add(new Student(8, "Oggy", 65));
       
        Collections.sort(students, new Comparator<Student>() {
        	
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s2.marks, s1.marks);
            }
        });

        
        
        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println("");
            
             }
    }
	}  






