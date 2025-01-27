class Teacher {
    public String name;

    public void teach() {
        System.out.println(name + " is teaching.");
    }
}

class Student {
    public String studentName;

    public void study() {
        System.out.println(studentName + " is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mr.Sri";  // Accessing public variable
        teacher.teach();  // Accessing public method

        Student student = new Student();
        student.studentName = "Ram";  // Accessing public variable
        student.study();  // Accessing public method
    }
}
