package sk.itsovy.dolinsky.projectgoodschool;

import java.io.*;
import java.util.List;

public class Main {
    private static School school;
    public static void main(String[] args) {
        School school = new School();
        Student student;
        String data;

        try{
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
                System.out.println(student.getFullName()
                        + " "
                        + student.getG_Mat()
                        + " "
                        + student.getG_Eng()
                        + " " + student.getG_Inf()
                        + " " + student.getAbsence());
            }

            br.close();
            System.out.println(school.getCount());


        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("\n");
        school.getListSortedByLastNameAsc();
        school.printList();
    }
//    public static void main(String[] args) {
//        Student student;
//
//
//        try {
//            File myFile = new File("students.dat");
//            FileReader fr = new FileReader(myFile);
//            BufferedReader read = new BufferedReader(fr);
//            String data;
//            while ((data = read.readLine()) != null) {
//                String[] arrOfStr = data.split(" ");
//                String firstName = arrOfStr[0];
//                String lastName = arrOfStr[1];
//                byte gmat = Byte.valueOf(arrOfStr[2]);
//                byte geng = Byte.valueOf(arrOfStr[3]);
//                byte ginf = Byte.valueOf(arrOfStr[4]);
//                int absence = Integer.valueOf(arrOfStr[5]);
//                student = new Student(firstName,lastName,gmat,geng,ginf,absence);
//                school.addStudent(student);
//                System.out.println();
//                System.out.println(student.getFullName() + " " + student.getG_Mat() + " " + student.getG_Eng() + " " + student.getG_Inf() + " " + student.getAbsence());
//            }
//            read.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


}
