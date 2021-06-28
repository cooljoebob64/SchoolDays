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
    
    //^^^^^^^^^^^ Define "courses" above this line ^^^^^^^^^^^^^^^^^^^^^^^

    
    //Define and initialize a second empty map variable called "students" 
    //where you can lookup a student by their name (key), and get a list of
    //courses (value) they are taking:
    //TODO!
    
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
    }
    
    public void printAllStudents()
    {
        //Write code to print all the students.
        //Bonus: When you display each student, display the number
        //       of courses the student is taking.
        //Bonus: alphabetize the student names.
        //TODO!        
    }
    
    public void printStudentsInCourse(String course)
    {        
        //Write code to print all the students taking the course.
        //Bonus: alphabetize the student names.
        //Bonus: Print nothing, rather than having an error
        //       if course does not exist
        //TODO!
    }
    
    public void printCoursesTakenByStudent(String student)
    {
        //Write code to print all the courses taken by a particular 
        //student.
        //Bonus: alphabetize the student names.        
        //Bonus: Print nothing, rather than having an error
        //       if student does not exist
        //TODO!        
    }
    
    //You won't need a main method, Test has a main method that calls
    //all the methods in this. Run Test.java as Java Application to 
    //test your code.    
}
