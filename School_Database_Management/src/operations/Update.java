package operations;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;

import teacher.Teacher;

import utility.utility;

public class Update {

    // =========================
    // UPDATE STUDENT
    // =========================

    public void updateStudent(Scanner sc,
                              ArrayList<Student> studentList) {

        int updateId = utility.readInt(sc, "Enter the student ID to update: ");

        boolean updateFound = false;

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).getId() == updateId) {

                updateFound = true;

                System.out.println();
                System.out.println("Student information before update:");
                studentList.get(i).display();

                System.out.println();

                studentList.get(i).setName(utility.readString_word(sc, "Enter new name: "));

                
				studentList.get(i).setAge(
				    utility.readInt(sc, "Enter new age: ")
				);

                studentList.get(i).setBlood_group(utility.readString_word(sc, "Enter new Blood group :"));

               
				studentList.get(i).setBatch(
				    utility.readInt(sc, "Enter new batch: ")
				);

                
				studentList.get(i).setStandard(
				    utility.readInt(sc, "Enter new standard: ")
				);

                studentList.get(i).setparent_name(utility.readString_word(sc, "Enter new Guardian name: "));

                studentList.get(i).setparent_phoneno(utility.readPhone_number(sc, "Enter new Guardian phone number: "));

                studentList.get(i).setCity(utility.readString_word(sc, "Enter new city: "));

                System.out.println();
                System.out.println(
                        "Student information updated successfully."
                );

                break;
            }
        }

        if (!updateFound) {

            System.out.println("Student ID not found.");
        }
    }
	
	// =========================
	// UPDATE TEACHER
	// =========================

	public void updateTeacher(Scanner sc,
	                          ArrayList<Teacher> teacherList) {

	    int updateTeacherId = utility.readInt(
    sc, "Enter the Teacher ID to update: "
);

	    boolean updateTeacherFound = false;

	    for (int i = 0; i < teacherList.size(); i++) {

	        if (teacherList.get(i).getid() == updateTeacherId) {

	            updateTeacherFound = true;

	            System.out.println();
	            System.out.println("Teacher information before update:");
	            teacherList.get(i).display();

	            System.out.println();
                
	            teacherList.get(i).setname(utility.readString_word(sc, "Enter new Teacher name: "));

				teacherList.get(i).setage(
				    utility.readInt(sc, "Enter new teacher age: ")
				);

	            
				int subjectCount = utility.readInt(
				    sc, "Enter number of subjects: "
				);

	            ArrayList<String> newSubjects = new ArrayList<>();

	            for (int j = 0; j < subjectCount; j++) {
				
	                String newSubject = utility.readString_word(sc ,"Enter subject " + (j + 1) + ": ");

	                newSubjects.add(newSubject);
	            }

	            teacherList.get(i).setsubject(newSubjects);

	           
				teacherList.get(i).setexperience(
				    utility.readInt(sc, "Enter new experience: ")
				);

	            teacherList.get(i).setcity(utility.readString_word(sc, "Enter new city: "));

	            System.out.println();
	            System.out.println(
	                    "Teacher information updated successfully."
	            );

	            break;
	        }
	    }

	    if (!updateTeacherFound) {

	        System.out.println("Teacher ID not found.");
	    }
	}
}