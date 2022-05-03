package com.example.testfinal;

public class Course {
    private int max = 2;
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents;
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        if(numberOfStudents == max){
            max *= 2;//กันจำนวนเกิน array
            String[] student_new = new String[max];
            for (int i = 0; i<numberOfStudents; i++){
                student_new[i] = students[i];
            }
            students = student_new;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student) {
        for(int i = 0; i<numberOfStudents; i++){
            if(students[i].equals(student)){
                System.arraycopy(students,i+1,students,i,numberOfStudents - i -1);
            }
        }
        numberOfStudents--;
    }
    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }

}
