package sk.itsovy.dolinsky.projectgoodschool;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    private static School school;
    public static void main(String[] args) {
        School school = new School();
        Student student;
        String data;

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.dat"));
            while((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(" ");
                String firstName = arrOfStr[0];
                String lastName = arrOfStr[1];
                byte gmat = Byte.valueOf(arrOfStr[2]);
                byte geng = Byte.valueOf(arrOfStr[3]);
                byte ginf = Byte.valueOf(arrOfStr[4]);
                int absence = Integer.valueOf(arrOfStr[5]);
                student = new Student(firstName,lastName,gmat,geng,ginf,absence);
                school.addStudent(student);

            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        school.printList();
        System.out.println("\n");
        System.out.println("The best student: "
                + school.getTheBestStudent().getFullName()
                + " MAT: " + school.getTheBestStudent().getG_Mat()
                + " ENG: " + school.getTheBestStudent().getG_Eng()
                + " INF: " + school.getTheBestStudent().getG_Inf()
                + " ABSENCE: " + school.getTheBestStudent().getAbsence()
        );
        System.out.println("The worst student: "
                + school.getTheWorstStudent().getFullName()
                + " MAT: " + school.getTheWorstStudent().getG_Mat()
                + " ENG: " + school.getTheWorstStudent().getG_Eng()
                + " INF: " + school.getTheWorstStudent().getG_Inf()
                + " ABSENCE: " + school.getTheWorstStudent().getAbsence()
        );
        System.out.println("Count of students: " + school.getCount());
        System.out.println("Average absence: " + school.getAverageAbsence());
        System.out.println("The Lowest Absence: " + school.getTheLowestAbsence());
        System.out.println("Average Math grade: " + school.getAverageGradeFromMath());
        System.out.println("Average grade: " + school.getAverageGrade());
        System.out.println("\n");
        System.out.println("Sorted by Last Name:");
        school.getListSortedByLastNameAsc();
        school.printList();
        System.out.println("\n");
        System.out.println("Sorted by Absence:");
        school.getListSortedByAbsenceDesc();
        school.printList();
    }
}
