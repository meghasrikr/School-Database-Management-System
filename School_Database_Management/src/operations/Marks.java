package operations;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;

import utility.utility;

public class Marks {

    // =========================================
    // STUDENTS WITH AVERAGE MARK GREATER THAN 40
    // =========================================

    public void studentsAverageGreaterThan40(
            ArrayList<Student> studentList,
            ArrayList<StudentMarks> marksList) {

        boolean displayFound = false;

        for (int i = 0; i < marksList.size(); i++) {

            if (marksList.get(i).average() > 40) {

                int studentId =
                        marksList.get(i).getstudentId();

                for (int j = 0; j < studentList.size(); j++) {

                    if (studentList.get(j).getId() == studentId) {

                        studentList.get(j).display();

                        System.out.println();

                        marksList.get(i).displayMarks();

                        System.out.println();

                        displayFound = true;

                        break;
                    }
                }
            }
        }

        if (!displayFound) {

            System.out.println("Not found.");
        }
    }
	
	// =========================================
	// PARTICULAR STUDENT TOTAL AND AVERAGE
	// =========================================

	public void particularStudentTotal(
	        Scanner sc,
	        ArrayList<StudentMarks> marksList) {
		
		int id = utility.readInt(sc, "Enter the Student ID: ");

	    boolean markFound = false;

	    for (int i = 0; i < marksList.size(); i++) {

	        if (marksList.get(i).getstudentId() == id) {

	            marksList.get(i).total();

	            System.out.println(
	                    "Average marks : " + marksList.get(i).average()
	            );

	            markFound = true;

	            break;
	        }
	    }

	    if (!markFound) {

	        System.out.println(
	                "Marks not found for this student."
	        );
	    }
	}
	
	// =========================================
	// ALL STUDENT TOTAL MARKS AND AVERAGE
	// =========================================

	public void allStudentTotal(
	        ArrayList<Student> studentList,
	        ArrayList<StudentMarks> marksList) {

	    System.out.println();
	    System.out.println("Display All Total Marks of Students");

	    for (int i = 0; i < marksList.size(); i++) {

	        int studentId =
	                marksList.get(i).getstudentId();

	        for (int j = 0; j < studentList.size(); j++) {

	            if (studentList.get(j).getId() == studentId) {

	                System.out.println(
	                        "Student ID : " + studentId
	                );

	                System.out.println(
	                        "Student Name : "
	                        + studentList.get(j).getName()
	                );

	                marksList.get(i).total();

	                System.out.println(
	                        "Average : "
	                        + marksList.get(i).average()
	                );

	                System.out.println();

	                break;
	            }
	        }
	    }
	}
	
	// ============================================
	// HIGHEST MARK FOR PARTICULAR STANDARD
	// ============================================

	public void highestMarkForStandard(
	        Scanner sc,
	        ArrayList<Student> studentList,
	        ArrayList<StudentMarks> marksList) {
			
	    int searchStandard = utility.readInt(sc, "Enter the Standard: ");

	    int highestTotal = -1;
	    int highestStudentId = -1;

	    boolean studentFound = false;

	    // Find students in the entered standard
	    for (int i = 0; i < studentList.size(); i++) {

	        if (studentList.get(i).getStandard() == searchStandard) {

	            studentFound = true;

	            int studentId = studentList.get(i).getId();

	            // Find marks of that student
	            for (int j = 0; j < marksList.size(); j++) {

	                if (marksList.get(j).getstudentId() == studentId) {

	                    if (marksList.get(j).gettotal_marks() > highestTotal) {

	                        highestTotal =
	                                marksList.get(j).gettotal_marks();

	                        highestStudentId = studentId;
	                    }

	                    break;
	                }
	            }
	        }
	    }

	    // Display highest mark student
	    if (studentFound && highestStudentId != -1) {

	        for (int i = 0; i < studentList.size(); i++) {

	            if (studentList.get(i).getId() == highestStudentId) {

	                System.out.println();
	                System.out.println("Highest Total Mark Student");
	                System.out.println("--------------------------------");

	                studentList.get(i).display();

	                // Display marks
	                for (int j = 0; j < marksList.size(); j++) {

	                    if (marksList.get(j).getstudentId()
	                            == highestStudentId) {

	                        marksList.get(j).displayMarks();

	                        break;
	                    }
	                }
	            }
	        }

	    } else if (studentFound) {

	        System.out.println(
	                "No marks found for students in this standard."
	        );

	    } else {

	        System.out.println(
	                "No students found in this standard."
	        );
	    }
	}
	
	// ================================================
	// HIGHEST MARK FROM EVERY STANDARD
	// ================================================

	public void highestMarkForAllStandards(
	        ArrayList<Student> studentList,
	        ArrayList<StudentMarks> marksList) {

	    System.out.println();
	    System.out.println("Highest Mark in Each Standard");
	    System.out.println("________________________________");

	    for (int standard = 1; standard <= 12; standard++) {

	        int highestMark = -1;
	        String highestStudent = "";
	        boolean found = false;

	        for (int i = 0; i < studentList.size(); i++) {

	            if (studentList.get(i).getStandard() == standard) {

	                int studentId = studentList.get(i).getId();

	                for (int j = 0; j < marksList.size(); j++) {

	                    if (marksList.get(j).getstudentId() == studentId) {

	                        if (marksList.get(j).gettotal_marks()
	                                > highestMark) {

	                            highestMark =
	                                    marksList.get(j).gettotal_marks();

	                            highestStudent =
	                                    studentList.get(i).getName();

	                            found = true;
	                        }

	                        break;
	                    }
	                }
	            }
	        }

	        if (found) {

	            System.out.println(
	                    "Standard -> " + standard
	                    + " : Student Name -> " + highestStudent
	                    + " : Highest Total -> " + highestMark
	            );

	        } else {

	            System.out.println(
	                    "Standard -> " + standard
	                    + " : Student Data not found"
	            );
	        }
	    }
	}
	
	// ================================================
	// SUBJECT-WISE STUDENT MARK
	// ================================================

	public void subjectWiseMark(
	        Scanner sc,
	        ArrayList<Student> studentList,
	        ArrayList<StudentMarks> marksList) {

	    int minimumMark = utility.readInt(sc, "Enter the minimum mark: ");

	    System.out.println();
	    System.out.println("Enter your preference:");
	    System.out.println("1. Tamil");
	    System.out.println("2. English");
	    System.out.println("3. Maths");
	    System.out.println("4. Physics");
	    System.out.println("5. Chemistry");

	    int choice = utility.readInt(sc, "Enter your choice: ");

	    boolean found = false;

	    for (int i = 0; i < studentList.size(); i++) {

	        int studentId = studentList.get(i).getId();

	        for (int j = 0; j < marksList.size(); j++) {

	            if (marksList.get(j).getstudentId() == studentId) {

	                int mark = 0;
	                String subject = "";

	                switch (choice) {

	                    case 1:
	                        mark = marksList.get(j).gettamil();
	                        subject = "Tamil";
	                        break;

	                    case 2:
	                        mark = marksList.get(j).getenglish();
	                        subject = "English";
	                        break;

	                    case 3:
	                        mark = marksList.get(j).getmaths();
	                        subject = "Maths";
	                        break;

	                    case 4:
	                        mark = marksList.get(j).getphysics();
	                        subject = "Physics";
	                        break;

	                    case 5:
	                        mark = marksList.get(j).getchemistry();
	                        subject = "Chemistry";
	                        break;

	                    default:
	                        System.out.println("Enter a valid choice.");
	                        return;
	                }

	                if (mark > minimumMark) {

	                    System.out.println();
	                    System.out.println(
	                            "Standard : "
	                            + studentList.get(i).getStandard()
	                    );

	                    System.out.println(
	                            "Student Name : "
	                            + studentList.get(i).getName()
	                    );

	                    System.out.println(
	                            subject + " Mark : " + mark
	                    );

	                    System.out.println();

	                    found = true;
	                }

	                break;
	            }
	        }
	    }

	    if (!found) {

	        System.out.println("No student found.");
	    }
	}
	
	
}