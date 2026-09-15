package operations;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;
import teacher.Teacher;

import utility.utility;

public class Search {

      // ===============================
	  // SEARCH BY STUDENT NAME
	  // ===============================
	  
	  public void searchByName(Scanner sc,
	                           ArrayList<Student> studentList,
	                           ArrayList<StudentMarks> marksList) {

	      String searchName = utility.readString_word(sc, "Enter the name to search: ");

	      boolean nameFound = false;

	      for (int i = 0; i < studentList.size(); i++) {

	          String studentName =
	                  studentList.get(i).getName().toLowerCase();

	          String search =
	                  searchName.toLowerCase();

	          if (studentName.contains(search)) {

	              studentList.get(i).display();

	              for (int j = 0; j < marksList.size(); j++) {

	                  if (marksList.get(j).getstudentId()
	                          == studentList.get(i).getId()) {

	                      System.out.println();
	                      System.out.println("Marks Details:");

	                      marksList.get(j).displayMarks();

	                      break;
	                  }
	              }

	              System.out.println();

	              nameFound = true;
	          }
	      }

	      if (!nameFound) {

	          System.out.println();
	          System.out.println("No student found.");
	      }
	  }
	  
	  
	  // ===============================
	  // SEARCH BY NAME AND STANDARD
	  // ===============================
	  
	  public void searchByNameAndStandard(Scanner sc,
	                                      ArrayList<Student> studentList,
	                                      ArrayList<StudentMarks> marksList) {

	      String searchName = utility.readString_word(sc, "Enter the student name: ");

		  int searchStandard = utility.readInt(sc, "Enter the standard: ");

	      boolean studentFound = false;

	      for (int i = 0; i < studentList.size(); i++) {

	          String studentName =
	                  studentList.get(i).getName().toLowerCase();

	          String search =
	                  searchName.toLowerCase();

	          if (studentName.equals(search)
	                  && studentList.get(i).getStandard() == searchStandard) {

	              studentList.get(i).display();

	              for (int j = 0; j < marksList.size(); j++) {

	                  if (marksList.get(j).getstudentId()
	                          == studentList.get(i).getId()) {

	                      System.out.println();
	                      System.out.println("Marks Details:");

	                      marksList.get(j).displayMarks();

	                      break;
	                  }
	              }

	              System.out.println();

	              studentFound = true;
	              break;
	          }
	      }

	      if (!studentFound) {

	          System.out.println();
	          System.out.println(
	                  "Student with that name and standard not found."
	          );
	      }
	  }
	  
	  // ========================
	  // SEARCH BY STUDENT ID
	  // ========================
	  
	  public void searchById(Scanner sc,
	                         ArrayList<Student> studentList,
	                         ArrayList<StudentMarks> marksList) {

	      int searchId = utility.readInt(sc, "Enter the student ID: ");

	      boolean found = false;

	      for (int i = 0; i < studentList.size(); i++) {

	          if (studentList.get(i).getId() == searchId) {

	              studentList.get(i).display();

	              for (int j = 0; j < marksList.size(); j++) {

	                  if (marksList.get(j).getstudentId() == searchId) {

	                      System.out.println();
	                      System.out.println("Marks Details:");

	                      marksList.get(j).displayMarks();

	                      break;
	                  }
	              }

	              found = true;
	              break;
	          }
	      }

	      if (!found) {

	          System.out.println();
	          System.out.println("Student ID not found.");
	      }
	  }
	  
	  // ==============================
	  // SEARCH BY FIRST TWO LETTERS
	  // ==============================
	  
	  public void searchByFirstTwoLetters(Scanner sc,
	                                      ArrayList<Student> studentList) {

	      System.out.print("Enter the first two letters: ");
	      String twoLetters = sc.nextLine().toLowerCase();

	      boolean letterFound = false;

	      for (int i = 0; i < studentList.size(); i++) {

	          String studentName =
	                  studentList.get(i).getName().toLowerCase();

	          if (studentName.startsWith(twoLetters)) {

	              studentList.get(i).display();

	              System.out.println();

	              letterFound = true;
	          }
	      }

	      if (!letterFound) {

	          System.out.println(
	                  "Name not found with these starting letters."
	          );
	      }
	  }
	  
	  // ============================
	  // SEARCH BY LAST TWO LETTERS
	  // ============================
	  
	   public void searchByLastTwoLetters(Scanner sc,
	                                      ArrayList<Student> studentList) {

	       System.out.print("Enter the last two letters: ");
	       String lastTwoLetters = sc.nextLine().toLowerCase();

	       boolean letterFound = false;

	       for (int i = 0; i < studentList.size(); i++) {

	           String studentName =
	                   studentList.get(i).getName().toLowerCase();

	           if (studentName.endsWith(lastTwoLetters)) {

	               studentList.get(i).display();

	               System.out.println();

	               letterFound = true;
	           }
	       }

	       if (!letterFound) {

	           System.out.println(
	                   "No student found with these ending letters."
	           );
	       }
	   }
	   
	   // ================
	   // SERACH BY ID
	   // ================
	   
	   public void searchTeacherById(Scanner sc,
	                                 ArrayList<Teacher> teacherList) {

	       int teacherId = utility.readInt(sc, "Enter the Teacher ID: ");

	       boolean teacherFound = false;

	       for (int i = 0; i < teacherList.size(); i++) {

	           if (teacherList.get(i).getid() == teacherId) {

	               teacherList.get(i).display();

	               teacherFound = true;

	               break;
	           }
	       }

	       if (!teacherFound) {

	           System.out.println("Teacher ID not found.");
	       }
	   }
	   
	   // ============================
	   // SEARCH TEACHER BY SUBJECT
	   // ============================
	   
	   public void searchTeacherBySubject(Scanner sc,
	                                      ArrayList<Teacher> teacherList) {

	       String handlingSubject = utility.readString_word(sc, "Enter the Subject: ");

	       boolean subjectFound = false;

	       for (int i = 0; i < teacherList.size(); i++) {

	           if (teacherList.get(i).getsubject().contains(handlingSubject)) {

	               teacherList.get(i).display();

	               System.out.println();

	               subjectFound = true;
	           }
	       }

	       if (!subjectFound) {

	           System.out.println("Subject not found.");
	       }
	   }
	   
	   // ================================================
	   // SEARCH TEACHER HANDLING MORE THAN ONE SUBJECT
	   // ================================================
	   
	   public void searchTeacherMoreThanOneSubject(
	           ArrayList<Teacher> teacherList) {

	       boolean found = false;

	       System.out.println();
	       System.out.println("-----------------------------------------------");
	       System.out.println("Teachers handling more than one subject");
	       System.out.println("-----------------------------------------------");

	       for (int i = 0; i < teacherList.size(); i++) {

	           if (teacherList.get(i).getsubject().size() > 1) {

	               teacherList.get(i).display();

	               System.out.println();

	               found = true;
	           }
	       }

	       if (!found) {

	           System.out.println(
	                   "No Teacher Data found."
	           );
	       }
	   }   

}