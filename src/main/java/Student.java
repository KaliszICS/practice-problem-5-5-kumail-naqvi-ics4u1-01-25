public class Student implements Comparable {
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
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

    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "N:" + name + " A:" + age + " SN:" + studentNumber;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        try {
            int a = Integer.parseInt(this.studentNumber);
            int b = Integer.parseInt(other.studentNumber);
            return Integer.compare(a, b);
        } catch (NumberFormatException e) {
            return this.studentNumber.compareTo(other.studentNumber);
        }
    }
}