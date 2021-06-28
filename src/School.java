import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/* Welcome to an exercise to create a School enrollment system.
 * Go through the code in this file and read the comments to
 * see what is required....Everywhere there is a TODO!
 * comment you'll need to write some code.
 */

public class School
{
    //We are going to make a School enrollment system!
    //To do that we are going to keep track of students,
    //which we'll represent by a String holding their name,
    //and courses, which will also be represented by a String
    //holding the courses name.
    
    //While dealing with enrollments, we are going to have to
    //1. Look up by course, to get a list of all students taking a course.    
    //2. Look up by student, to get a list of all courses a student is taking.
    //We need to make data structures to make this possible.
    
    //We are going to define the enrollments as fields of School
   
    //Define and initialize an empty map variable called "courses" here where you
    //can lookup a course by it's name (key), and get a list of
    //students (value):    
    //TODO!
    	
	Map<String, ArrayList<String>> courses = new TreeMap<>();
	
    //^^^^^^^^^^^ Define "courses" above this line ^^^^^^^^^^^^^^^^^^^^^^^

    //Define and initialize a second empty map variable called "students" 
    //where you can lookup a student by their name (key), and get a list of
    //courses (value) they are taking:
//    TODO!
	
    Map<String, ArrayList<String>> students = new TreeMap<>();
    
    //^^^^^^^^^^^ Define "students" above this line ^^^^^^^^^^^^^^^^^^^^^^^
    
    //You should be able to access the fields you just defined from anywhere 
    //inside this class.
    
    //Next we are going to define an "enroll" method.
    public void enroll(String courseName, String studentName)
    {        
        //Write code here to update the "courses" and "students"
        //map variables, based on a courseName and studentName
        //variable passed into the method. Add the student
        //to the course in 'courses', and add the course to the
        //to the student in 'students'.
        
        //Note: when a student enrolls in a course twice, it should 
        //detect this, and prevent duplicate enrollments.
        //TODO!               
    	
		if (!courses.containsKey(courseName)) {
			courses.put(courseName, new ArrayList<String>());
		}

   	
    	List<String> courseStudents = courses.get(courseName);
    	if(courseStudents.contains(studentName)) {
    		System.out.println(studentName + " is already enrolled in " + courseName + "!");
    	} else {
    		courseStudents.add(studentName);
    		if(!students.containsKey(studentName)) {
    			students.put(studentName, new ArrayList<String>());
    		}
    		students.get(studentName).add(courseName);
    	}

    }
    
    public void drop(String courseName, String studentName)
    {
        //Write code here to remove an enrollment,
        //undoing the changes that an enroll call does.
        
        //Note: silently ignore drops for students and courses
        //combinations that don't exist.
        
        //Bonus: if course enrollment drops to zero students
        //     for a course, remove the course from
        //     'courses'.....
        //        and
        //     if a student now has zero courses they are 
        //     taking, drop the student from 'students'
        //TODO!        
    	
    	if(courses.containsKey(courseName)) {
    		if(courses.get(courseName).contains(studentName)) {
    			System.out.println("Removing " + studentName + " from the course: " + courseName);
    			courses.get(courseName).remove(studentName);
    			students.get(studentName).remove(courseName);
    			if(courses.get(courseName).isEmpty()) {
    				courses.remove(courseName);
    			}
    			if(students.get(studentName).isEmpty()) {
    				students.remove(studentName);
    			}
    		}
    	}
    }   
    
    public void printAllCourses()
    {
        //Write code to print all courses. You can get them from 
        //the keys of the 'courses' variable.
        //
        //You'll want to lookup how to get all the keys of a Map.
        
        //Bonus: When you display each course, display the number
        //       of students in it.
        
        //Bonus: alphabetize the courses. (Look up Collections in
        //the java documentation)
        //TODO!        
    	Set<String> courseNames = courses.keySet();
    	for(String course : courseNames) {
    		System.out.println(course + ", enrolled students: " + courses.get(course).size());
    	}
    }
    
    public void printAllStudents()
    {
        //Write code to print all the students.
        //Bonus: When you display each student, display the number
        //       of courses the student is taking.
        //Bonus: alphabetize the student names.
        //TODO!        
    	
    	Set<String> studentNames = students.keySet();
    	for(String student : studentNames) {
    		System.out.println(student + " is taking " + students.get(student).size() + " course(s).");
    	}
    }
    
    public void printStudentsInCourse(String course)
    {        
        //Write code to print all the students taking the course.
        //Bonus: alphabetize the student names.
        //Bonus: Print nothing, rather than having an error
        //       if course does not exist
        //TODO!
    	
    	if(courses.containsKey(course)) {

        	List<String> studentsInCourse = courses.get(course);
    		if(!studentsInCourse.isEmpty()) {
    			System.out.println("Students in course " + course);
    			for(String student : studentsInCourse) {
    				System.out.println(student);
    			}
    		} else System.out.println("No students in course " + course);
    	}
    	
    }
    
    public void printCoursesTakenByStudent(String student)
    {
        //Write code to print all the courses taken by a particular 
        //student.
        //Bonus: alphabetize the student names.        
        //Bonus: Print nothing, rather than having an error
        //       if student does not exist
        //TODO!        
    	
    	if(students.containsKey(student)) {
    		List<String> listOfCourses = students.get(student);
    		if(!listOfCourses.isEmpty()) {
    			System.out.println("List of courses for student " + student + ":"); 
    			for(String course : listOfCourses) {
    				System.out.println(course);
    			}
    		} else System.out.println("Student " + student + " has no courses.");
    	}
    }
    
    //You won't need a main method, Test has a main method that calls
    //all the methods in this. Run Test.java as Java Application to 
    //test your code.    
}
