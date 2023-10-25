package homeworks.hm16;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ComparatorByAverageGrade comparatorByAverageGrade = new ComparatorByAverageGrade();
        ArrayList students = new ArrayList<Student>();
        students.add(new Student("Tony Gun", 64.8));
        students.add(new Student("Natasha  Romanov", 91.5));
        students.add(new Student("Gigi Buffon", 75.4));
        students.add(new Student("Andrej Friday", 80.1));
        students.add(new Student("John Snow", 59.9));

        Collections.sort(students, comparatorByAverageGrade);

        for (Object student : students) {
            System.out.println(student);

        }
    }
}
