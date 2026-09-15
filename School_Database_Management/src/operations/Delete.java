package operations;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;

import teacher.Teacher;

import utility.utility;

public class Delete {

    // =========================
    // DELETE STUDENT
    // =========================

    public void deleteStudent(Scanner sc,
                              ArrayList<Student> studentList,
                              ArrayList<StudentMarks> marksList) {
		
		int deleteId = utility.readInt(sc, "Enter the Student ID to delete: ");

        boolean deleteFound = false;

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).getId() == deleteId) {

                deleteFound = true;

                studentList.remove(i);

                // Remove marks of deleted student
                for (int j = 0; j < marksList.size(); j++) {

                    if (marksList.get(j).getstudentId() == deleteId) {

                        marksList.remove(j);

                        break;
                    }
                }

                System.out.println();
                System.out.println(
                        "Student information deleted successfully."
                );

                break;
            }
        }

        if (!deleteFound) {

            System.out.println("Student ID not found.");
        }
    }
	
	// =========================
	// DELETE TEACHER
	// =========================

	public void deleteTeacher(Scanner sc,
	                          ArrayList<Teacher> teacherList) {

	    int deleteTeacherId = utility.readInt(sc, "Enter the Teacher ID to delete: ");

	    boolean deleteTeacherFound = false;

	    for (int i = 0; i < teacherList.size(); i++) {

	        if (teacherList.get(i).getid() == deleteTeacherId) {

	            deleteTeacherFound = true;

	            teacherList.remove(i);

	            System.out.println();
	            System.out.println(
	                    "Teacher information deleted successfully."
	            );

	            break;
	        }
	    }

	    if (!deleteTeacherFound) {

	        System.out.println("Teacher ID not found.");
	    }
	}
}