/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();

        ls.add(new Student("1", "Dang Huu Quang", "Spring", "Java"));
        ls.add(new Student("2", "Nguyen Minh Hieu", "Summer", ".Net"));
        ls.add(new Student("3", "Le Cao Nguyen", "Spring", "C/C++"));

        int count = 3;
        while (true) {
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDeleteStudent(count, ls);
                    break;
                case 4:
                    Manager.report(ls);
                    break;
                case 5:
                    return;
            }
        }

    }
}
