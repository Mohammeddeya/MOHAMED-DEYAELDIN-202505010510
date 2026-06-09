public class Mohhamedain {
    public static void main(String[] args) {
        Student s1 = new Student("ATIF HAROON", 23, 3.0);

        s1.displayInfo();
        s1.study();
        s1.displayInfo();
    }
}

class Student {
    // Attributes
    String name;
    int age;
    double gpa;

    // Constructor
    Student(String studentName, int studentAge, double studentGpa) {
        name = studentName;
        age = studentAge;
        gpa = studentGpa;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void takeExam() {
        System.out.println(name + " is doing the exam.");
    }
}