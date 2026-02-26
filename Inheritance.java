import java.util.Scanner;

class Person {

    private String firstName;
    private String lastName;
    private String gender;

    Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    Person() {}

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGender() { return gender; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGender(String gender) { this.gender = gender; }

    public String toString() {
        return firstName + " " + lastName + " " + gender;
    }

    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equals(p.firstName)
                && lastName.equals(p.lastName)
                && gender.equals(p.gender);
    }
}

class Teacher extends Person {

    private String department;
    private String[] courses;

    Teacher(String firstName, String lastName, String gender,
            String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    Teacher() {}

    public String getDepartment() { return department; }
    public String[] getCourses() { return courses; }

    public void setDepartment(String department) { this.department = department; }
    public void setCourses(String[] courses) { this.courses = courses; }

    public String toString() {
        String result = super.toString() + " " + department + " ";
        if (courses != null) {
            for (int i = 0; i < courses.length; i++) {
                result += courses[i] + " ";
            }
        }
        return result;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;
        if (courses.length != t.courses.length) return false;

        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i]))
                return false;
        }
        return true;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("first name:");
        String firstName = sc.nextLine();

        System.out.println("last name:");
        String lastName = sc.nextLine();

        System.out.println("gender:");
        String gender = sc.nextLine();

        System.out.println("department:");
        String department = sc.nextLine();

        System.out.println("how many courses?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] courses = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("which courses? " + (i + 1) + ":");
            courses[i] = sc.nextLine();
        }

        Teacher t1 = new Teacher(firstName, lastName, gender, department, courses);

        System.out.println("information:");
        System.out.println(t1.toString());
    }
}