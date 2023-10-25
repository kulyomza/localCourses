package homeworks.hm16;

public class Student {

    private String name;
    private double averageGrade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }

    public Student(String name, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }


    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

}
