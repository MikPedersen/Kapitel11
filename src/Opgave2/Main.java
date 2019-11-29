package Opgave2;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Benjamin", "Villavej",
                "Benjamin@hotmail.dk", 22222222);

        Student student = new Student("Kelvin", "Mor",
                "Kelvinhoof@hotmail.dk" , 23232323, 1);

        Employee employee = new Employee("Anders", "Jyderupvej",
                "System@hotmail.dk", 24242424, 2, 200000);

        Faculty faculty = new Faculty("Andras", "Ungarnvej",
                "Bestprogrammer@hotmail.dk", 25252525, 3, 490000,
                37, 1);

        Staff staff = new Staff("Karsten", "Finlandsvej",
                "Nokia@hotmail.dk", 26262626, 1, 800000, "Professor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
