public class Employee {
    String name;
    int age;
    String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    @Override
    public String toString() {
        return name + " (" + age + ", " + department + ")";
    }
}
