class Student {
    String name;
    int rollNumber;
    List<Integer> grades;
    int attendance;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.attendance = 0;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void markAttendance() {
        attendance++;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Attendance: " + attendance);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1);
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        student.markAttendance();
        student.markAttendance();

        student.displayDetails();
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}
