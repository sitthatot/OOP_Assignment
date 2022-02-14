public class Course {
    private String courseName;
    private String[] students = new String[2];
    public int numberOfStudents = 0;

    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] increase = new String[students.length + 1];
            System.arraycopy(students,0,increase,0,students.length);
            students = increase;
        }
        students[numberOfStudents++] = student;
    }
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public String[] getStudents() {
        return students;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String student){
        for(int i = 0; i<numberOfStudents; i++){
            if(students[i].equals(student)){
                System.arraycopy(students,i+1,students,i,numberOfStudents - i - 1);
                break;
            }
        }
        numberOfStudents--;
    }
    public void clear() {
        students = new String[2];
        numberOfStudents = 0;
    }
}
