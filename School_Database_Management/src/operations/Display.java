package operations;

import java.util.ArrayList;
import java.util.*;

import student.Student;
import student.StudentMarks;
import teacher.Teacher;

import utility.utility;

public class Display {

    // =========================
    // DISPLAY ALL STUDENTS
    // =========================

    public void displayAllStudents(
            ArrayList<Student> studentList,
            ArrayList<StudentMarks> marksList) {

        System.out.println();
        System.out.println("======================================");
        System.out.println("      ALL STUDENT INFORMATION");
        System.out.println("======================================");

        boolean info = false;

        for (int i = 0; i < studentList.size(); i++) {

            studentList.get(i).display();

            boolean marksFound = false;

            for (int j = 0; j < marksList.size(); j++) {

                if (marksList.get(j).getstudentId()
                        == studentList.get(i).getId()) {

                    System.out.println();
                    System.out.println("Marks Details:");

                    marksList.get(j).displayMarks();

                    marksFound = true;

                    break;
                }
            }

            if (!marksFound) {

                System.out.println();
                System.out.println("Marks : Not entered yet");
            }

            System.out.println();

            info = true;
        }

        if (!info) {

            System.out.println("There is no student data.");
        }
    }
	
	// =========================
	// DISPLAY ALL TEACHERS
	// =========================

	public void displayAllTeachers(ArrayList<Teacher> teacherList) {

	    System.out.println();
	    System.out.println("======================================");
	    System.out.println("       ALL TEACHER INFORMATION");
	    System.out.println("======================================");

	    if (teacherList.size() == 0) {

	        System.out.println("There is no teacher data.");

	    } else {

	        for (int i = 0; i < teacherList.size(); i++) {

	            teacherList.get(i).display();

	            System.out.println();
	        }
	    }
	}
	
	public void studentsInAscendingOrder(
	        Scanner sc,
	        ArrayList<Student> studentList,
	        ArrayList<StudentMarks> marksList) {

	    System.out.println();
	    System.out.println("======================================");
	    System.out.println("    STUDENTS IN ASCENDING ORDER");
	    System.out.println("======================================");

	    for (int i = 0; i < studentList.size(); i++) {

	        for (int j = i + 1; j < studentList.size(); j++) {

	            if (studentList.get(i).getName()
	                    .compareToIgnoreCase(studentList.get(j).getName()) > 0) {

	                Student temp = studentList.get(i);

	                studentList.set(i, studentList.get(j));
	                studentList.set(j, temp);
	            }
	        }
	    }

	    for (int i = 0; i < studentList.size(); i++) {

	        studentList.get(i).display();

	        for (int j = 0; j < marksList.size(); j++) {

	            if (marksList.get(j).getstudentId()
	                    == studentList.get(i).getId()) {

	                System.out.println("Marks Details:");
	                marksList.get(j).displayMarks();

	                break;
	            }
	        }

	        System.out.println();
	    }
	}
}