package menu.StudentMenu;

import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentMarks;
import operations.*;

import utility.utility;

public class StudentMenu {

    public int showStudentMenu(
            Scanner sc,
            ArrayList<Student> studentList,
            ArrayList<StudentMarks> marksList,
            Add add,
            Search search,
            Update update,
            Delete delete,
            Display display,
            Marks marks,
            int nextStudentId) {

        int studentChoice;

        do {

            System.out.println();
            System.out.println("======================================");
            System.out.println("             STUDENT DATA");
            System.out.println("======================================");

            System.out.println("1. Enter Student Detail");
            System.out.println("2. Add Marks");
            System.out.println("3. Search Student");
            System.out.println("4. Get All Student Information");
            System.out.println("5. Marks Detail Extraction");
            System.out.println("6. Update Student Information");
            System.out.println("7. Delete Student Information");
            System.out.println("8. Highest Mark for Particular Standard");
            System.out.println("9. Highest Mark for All Standards");
            System.out.println("10. Subject Wise Mark");
            System.out.println("11. Students in Ascending Order");
            System.out.println("12. Back to Main Menu");

            System.out.println();

            studentChoice = utility.readInt(sc, "Enter your choice: ");

            switch (studentChoice) {

                // =========================================
                // ADD STUDENT
                // =========================================

                case 1:

                    nextStudentId =
                        add.addStudent(
                            sc,
                            studentList,
                            nextStudentId
                        );

                    break;


                // =========================================
                // ADD MARKS
                // =========================================

                case 2:

                    add.addMarks(
                        sc,
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // SEARCH STUDENT
                // =========================================

                case 3:

                    int searchChoice;

                    System.out.println();
                    System.out.println("======================================");
                    System.out.println("           SEARCH STUDENT");
                    System.out.println("======================================");

                    System.out.println("1. Search by Name or Letter");
                    System.out.println("2. Search by Name and Standard");
                    System.out.println("3. Search by Student ID");
                    System.out.println("4. Search by First Two Letters");
                    System.out.println("5. Search by Last Two Letters");

                    searchChoice = utility.readInt(sc, "Enter your choice: ");

                    switch (searchChoice) {

                        case 1:

                            search.searchByName(
                                sc,
                                studentList,
                                marksList
                            );

                            break;

                        case 2:

                            search.searchByNameAndStandard(
                                sc,
                                studentList,
                                marksList
                            );

                            break;

                        case 3:

                            search.searchById(
                                sc,
                                studentList,
                                marksList
                            );

                            break;

                        case 4:

                            search.searchByFirstTwoLetters(
                                sc,
                                studentList
                            );

                            break;

                        case 5:

                            search.searchByLastTwoLetters(
                                sc,
                                studentList
                            );

                            break;

                        default:

                            System.out.println(
                                "Enter a valid choice."
                            );
                    }

                    break;


                // =========================================
                // DISPLAY ALL STUDENTS
                // =========================================

                case 4:

                    display.displayAllStudents(
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // MARKS DETAIL EXTRACTION
                // =========================================

                case 5:

                    int marksChoice;

                    System.out.println();
                    System.out.println("======================================");
                    System.out.println("       MARK DETAILS EXTRACTION");
                    System.out.println("======================================");

                    System.out.println(
                        "1. Student Average Greater Than 40"
                    );

                    System.out.println(
                        "2. Particular Student Total"
                    );

                    System.out.println(
                        "3. All Student Total and Average"
                    );

                    marksChoice = utility.readInt(sc, "Enter your choice: ");

                    switch (marksChoice) {

                        case 1:

                            marks.studentsAverageGreaterThan40(
                                studentList,
                                marksList
                            );

                            break;

                        case 2:

                            marks.particularStudentTotal(
                                sc,
                                marksList
                            );

                            break;

                        case 3:

                            marks.allStudentTotal(
                                studentList,
                                marksList
                            );

                            break;

                        default:

                            System.out.println(
                                "Enter a valid choice."
                            );
                    }

                    break;


                // =========================================
                // UPDATE STUDENT
                // =========================================

                case 6:

                    update.updateStudent(
                        sc,
                        studentList
                    );

                    break;


                // =========================================
                // DELETE STUDENT
                // =========================================

                case 7:

                    delete.deleteStudent(
                        sc,
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // HIGHEST MARK FOR STANDARD
                // =========================================

                case 8:

                    marks.highestMarkForStandard(
                        sc,
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // HIGHEST MARK FOR ALL STANDARDS
                // =========================================

                case 9:

                    marks.highestMarkForAllStandards(
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // SUBJECT WISE MARK
                // =========================================

                case 10:

                    marks.subjectWiseMark(
                        sc,
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // ASCENDING ORDER
                // =========================================

                case 11:

                    display.studentsInAscendingOrder(
                        sc,
                        studentList,
                        marksList
                    );

                    break;


                // =========================================
                // BACK
                // =========================================

                case 12:

                    System.out.println(
                        "Returning to Main Menu..."
                    );

                    break;


                default:

                    System.out.println(
                        "Enter a valid input."
                    );
            }

        } while (studentChoice != 12);

        return nextStudentId;
    }
}