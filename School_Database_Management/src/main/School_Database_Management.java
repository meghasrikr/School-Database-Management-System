package main;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;
import teacher.Teacher;

import operations.*;
import menu.StudentMenu.StudentMenu;
import menu.TeacherMenu.TeacherMenu;

import utility.utility;

public class School_Database_Management {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<StudentMarks> marksList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();

        int nextStudentId = 1;
        int nextTeacherId = 1;

        Add add = new Add();
        Search search = new Search();
        Update update = new Update();
        Delete delete = new Delete();
        Display display = new Display();
        Marks marks = new Marks();

        StudentMenu studentMenu = new StudentMenu();
        TeacherMenu teacherMenu = new TeacherMenu();

        int mainChoice;

        do {

            System.out.println();
            System.out.println("=======================================");
            System.out.println("\u001B[44m\u001B[97m STUDENT MANAGEMENT SYSTEM \u001B[0m");
            System.out.println("=======================================");
            System.out.println("1. Student Data");
            System.out.println("2. Teacher Data");
            System.out.println("3. Exit");

            mainChoice = utility.readInt(sc, "Enter your choice: ");

            switch (mainChoice) {

                case 1:
                    nextStudentId = studentMenu.showStudentMenu(
                        sc,
                        studentList,
                        marksList,
                        add,
                        search,
                        update,
                        delete,
                        display,
                        marks,
						nextStudentId
                    );
                    break;

                case 2:
                    nextTeacherId = teacherMenu.showTeacherMenu(
                        sc,
                        teacherList,
                        add,
                        search,
                        update,
                        delete,
                        display,
						nextTeacherId
                    );
                    break;

                case 3:
                    System.out.println(
                        "Thank you for using Student Database Management."
                    );
                    break;

                default:
                    System.out.println("Enter a valid input.");
            }

        } while (mainChoice != 3);

        sc.close();
    }
}