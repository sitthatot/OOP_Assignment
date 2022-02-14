public class pro2_64010889_week6 {

    public static void main(String[] args) {
        Course course = new Course("MUSIC");
        course.addStudent("Sittha");
        course.addStudent("MIMI");
        course.addStudent("Prae");
        course.dropStudent("Prae");
        for(int i = 0; i<course.numberOfStudents; i++){
            System.out.println(course.getStudents()[i]);
        }
    }
}
