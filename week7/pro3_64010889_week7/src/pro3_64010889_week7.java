public class pro3_64010889_week7 {

    public static void main(String[] args) {
        Person person = new Person("Sittha", "MyHouse",
                "084-xxx-xxxx", "64010889@kmitl.ac.th");
        Student student = new Student("Sittha", "MyHouse", "084-xxx-xxxx",
                "64010889@kmitl.ac.th", Student.FRESHMAN);
        Employee employee = new Employee("Sittha", "MyHouse", "084-xxx-xxxx",
                "64010889@kmitl.ac.th",119,100000);
        Faculty faculty = new Faculty("Sittha", "MyHouse", "084-xxx-xxxx",
                "64010889@kmitl.ac.th", 119, 50000, "4pm to 6pm", "Professor");
        Staff staff = new Staff("Sittha", "MyHouse", "084-xxx-xxxx",
                "64010889@kmitl.ac.th", 119, 65000, "Executive Producer");

        System.out.println(person.toString()+ "\n");
        System.out.println("Student"+student.toString() + "\n");
        System.out.println("Employee"+employee.toString() + "\n");
        System.out.println("Facultyt"+faculty.toString() + "\n");
        System.out.println("Staff"+staff.toString() + "\n");
    }
}
