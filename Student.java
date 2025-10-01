
public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tini", 18);
        Student s2 = new Student("Bob", 19);
        System.out.println(s1);
        System.out.println(s2);
    }
}
