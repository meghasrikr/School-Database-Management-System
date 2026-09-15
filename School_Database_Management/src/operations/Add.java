package operations;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;
import teacher.Teacher;

import utility.utility;

public class Add {
    
	// ============
	// ADD STUDENT
	// ============
	
    public int addStudent(Scanner sc, ArrayList<Student> studentList, int nextStudentId) {
	
        int n = utility.readInt(sc, "Enter the number of student details need to enter: ");

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Enter the student " + (i + 1) + " detail");

            int id = nextStudentId;

            System.out.println("Generated Student id : " + id);
			
            String name = utility.readString_word(sc, "Enter the name: ");

            int age = utility.readInt(sc, "Enter the age: ");

            String blood_group = utility.readString_word(sc, "Enter the blood group: ");

            int batch = utility.readInt(sc, "Enter the batch: ");

            int standard = utility.readInt(sc, "Enter the standard: ");

            String parent_name = utility.readString_word(sc, "Enter the Guardian name: ");

            String parent_phoneno = utility.readPhone_number(sc, "Enter the Guardian phone_no: ");
			
            String city = utility.readString_word(sc, "Enter the city: ");

            Student stud = new Student(
                name,
                id,
                age,
                blood_group,
                batch,
                standard,
                parent_name,
                parent_phoneno,
                city
            );

            studentList.add(stud);

            nextStudentId++;

            System.out.println();
            System.out.println("Student data registered successfully.");
            System.out.println("Student ID : " + id);
            System.out.println("Now use 'Add Marks' to enter marks.");
        }
		
		return nextStudentId;
    }
	
	// =================
	// ADD MARKS 
    // =================
	
	public void addMarks(Scanner sc,
	                     ArrayList<Student> studentList,
	                     ArrayList<StudentMarks> marksList) {

	    System.out.println();
	    System.out.println("======================================");
	    System.out.println("              ADD MARKS");
	    System.out.println("======================================");

		int markStudentId = utility.readInt(sc, "Enter the Student ID: ");

	    boolean studentFoundForMarks = false;

	    for (int i = 0; i < studentList.size(); i++) {

	        if (studentList.get(i).getId() == markStudentId) {

	            studentFoundForMarks = true;

	            System.out.println();
	            System.out.println("Student Name : "
	                    + studentList.get(i).getName());

	            System.out.println("Student Standard : "
	                    + studentList.get(i).getStandard());

	            System.out.println();

	            int tamil = utility.readInt(sc, "Enter the Tamil Subject mark: ");

	            int english = utility.readInt(sc, "Enter the English Subject mark: ");

	            int maths = utility.readInt(sc, "Enter the Maths Subject mark: ");

	            int physics = utility.readInt(sc, "Enter the Physics Subject mark: ");

	            int chemistry = utility.readInt(sc, "Enter the Chemistry Subject mark: ");

	            boolean marksAlreadyExist = false;

	            for (int j = 0; j < marksList.size(); j++) {

	                if (marksList.get(j).getstudentId() == markStudentId) {

	                    marksList.get(j).settamil(tamil);
	                    marksList.get(j).setenglish(english);
	                    marksList.get(j).setmaths(maths);
	                    marksList.get(j).setphysics(physics);
	                    marksList.get(j).setchemistry(chemistry);

	                    marksList.get(j).settotal_marks(
	                            tamil + english + maths + physics + chemistry
	                    );

	                    marksAlreadyExist = true;

	                    System.out.println();
	                    System.out.println("Marks updated successfully.");

	                    break;
	                }
	            }

	            if (!marksAlreadyExist) {

	                StudentMarks marks = new StudentMarks(
	                        markStudentId,
	                        tamil,
	                        english,
	                        maths,
	                        physics,
	                        chemistry
	                );

	                marksList.add(marks);

	                System.out.println();
	                System.out.println("Marks added successfully.");
	            }

	            break;
	        }
	    }

	    if (!studentFoundForMarks) {

	        System.out.println();
	        System.out.println("Student ID not found.");
	        System.out.println("Please enter a valid Student ID.");
	    }
	}	
	
	// =======================
	// ADD TEACHER
	// =======================
	
	public int addTeacher(Scanner sc, ArrayList<Teacher> teacherList, int nextTeacherId) {

	    int n = utility.readInt(sc, "Enter the number of teacher details need to enter: ");
		
	    for (int i = 0; i < n; i++) {

	        System.out.println();
	        System.out.println("Enter Teacher " + (i + 1) + " detail");

	        int id = nextTeacherId;

	        System.out.println("Generated Teacher ID : " + id);
			
	        String name = utility.readString_word(sc, "Enter teacher name: ");

			int age = utility.readInt(sc, "Enter teacher age: ");

	        int subject_count = utility.readInt(sc, "Enter the number of subject: ");

	        ArrayList<String> subject = new ArrayList<>();

	        for (int j = 0; j < subject_count; j++) {

	            String subjects = utility.readString_word(sc, "Subject " + (j + 1) + " : ");

	            subject.add(subjects);
	        }

	        int experience = utility.readInt(sc, "Enter experience: ");
			
	        String city = utility.readString_word(sc, "Enter city: ");

	        Teacher teacher = new Teacher(
	                name,
	                id,
	                age,
	                subject,
	                experience,
	                city
	        );

	        teacherList.add(teacher);

	        nextTeacherId++;

	        System.out.println();
	        System.out.println("Teacher data registered successfully.");
	        System.out.println("Teacher ID : " + id);
	    }
		
		return nextTeacherId;
	}
	
}