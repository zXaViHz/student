
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static String checkInputString() {

        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("It is empty");
                System.out.println("Enter again");
            } else {
                return result;
            }
        }

    }

    public static boolean checkInputYN() {

        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y") || result.equalsIgnoreCase("y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N") || result.equalsIgnoreCase("n")) {
                return false;
            }

            System.err.println("Please input y/Y or n/N.");
            System.out.println("Enter again: ");
        }
    }

    public static boolean checkInputUD() {

        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.print("Please enter u/U or d/D");
            System.out.print("Enter again: ");

        }
    }

    public static boolean checkChangeInformation(Student student, String id, String name,
            String semester, String course) {
        return !(id.equalsIgnoreCase(student.getId())
                && name.equalsIgnoreCase(student.getStudentName())
                && semester.equalsIgnoreCase(student.getSemester())
                && course.equalsIgnoreCase(student.getCourseName()));
    }

    public static boolean checkStudentExist(ArrayList<Student> ls, String id, String sudentName, String semester,
            String courseName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && sudentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkReportExists(ArrayList<Report> lr, String name, String course, int total) {
        for (Report report : lr) {
            if (name.equalsIgnoreCase(report.getStudentName())
                    && course.equalsIgnoreCase(report.getCourseName())
                    && total == report.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number in range [" + min + ", " + max + "] ");
                System.out.print("Enter again: ");
            }
        }
    }

    public static boolean checkIdExists(ArrayList<Student> ls, String id, String name) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && !name.equalsIgnoreCase(student.getStudentName())) {
                return false;
            }
        }
        return true;
    }

    public static String checkInputCourse() {

        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Java") || result.equalsIgnoreCase(".Net") || result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.err.println("Just only 3 course: Java, .Net, .C/C++");
            System.out.println("Enter again: ");
        }
    }

}
