package menu.TeacherMenu;

import java.util.ArrayList;
import java.util.Scanner;

import teacher.Teacher;
import operations.*;

import utility.utility;

public class TeacherMenu {

    public int showTeacherMenu(
            Scanner sc,
            ArrayList<Teacher> teacherList,
            Add add,
            Search search,
            Update update,
            Delete delete,
            Display display,
            int nextTeacherId) {

        int teacherChoice;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("             TEACHER DATA");
            System.out.println("======================================");

            System.out.println("1. Enter Teacher Detail");
            System.out.println("2. Get Specific Teacher Information");
            System.out.println("3. Get All Teacher Information");
            System.out.println("4. Update Teacher Information");
            System.out.println("5. Delete Teacher Information");
            System.out.println("6. Get Teacher by Handling Subject");
            System.out.println("7. Get Teacher Handling More Than One Subject");
            System.out.println("8. Back to Main Menu");

            System.out.println();

            teacherChoice = utility.readInt(sc, "Enter your choice: ");

            switch (teacherChoice) {

                // =========================================
                // ADD TEACHER
                // =========================================

                case 1:

                    nextTeacherId =
                        add.addTeacher(
                            sc,
                            teacherList,
                            nextTeacherId
                        );

                    break;


                // =========================================
                // SEARCH TEACHER BY ID
                // =========================================

                case 2:

                    search.searchTeacherById(
                        sc,
                        teacherList
                    );

                    break;


                // =========================================
                // ALL TEACHERS
                // =========================================

                case 3:

                    display.displayAllTeachers(
                        teacherList
                    );

                    break;


                // =========================================
                // UPDATE TEACHER
                // =========================================

                case 4:

                    update.updateTeacher(
                        sc,
                        teacherList
                    );

                    break;


                // =========================================
                // DELETE TEACHER
                // =========================================

                case 5:

                    delete.deleteTeacher(
                        sc,
                        teacherList
                    );

                    break;


                // =========================================
                // TEACHER BY SUBJECT
                // =========================================

                case 6:

                    search.searchTeacherBySubject(
                        sc,
                        teacherList
                    );

                    break;


                // =========================================
                // MORE THAN ONE SUBJECT
                // =========================================

                case 7:

                    search.searchTeacherMoreThanOneSubject(
                        teacherList
                    );

                    break;


                // =========================================
                // BACK
                // =========================================

                case 8:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;


                default:

                    System.out.println(
                        "Enter a valid input."
                    );
            }

        } while (teacherChoice != 8);

        return nextTeacherId;
    }
}