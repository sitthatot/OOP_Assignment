package com.example.testfinal;
public class pro2 {
    public static void main(String[] args) {
        Course music = new Course("music");

        music.addStudent("Tot");
        music.addStudent("Prae");
        music.addStudent("Mark");

        music.dropStudent("Prae");

//        music.clear();
//        music.addStudent("Beam");
        System.out.println(music.getCourseName()+" Course's students: ");
        String[] students = music.getStudents();
        for(int i = 0; i< music.getNumberOfStudents();i++){
            System.out.println(students[i]);
        }
        System.out.println(music.getNumberOfStudents());

    }
}