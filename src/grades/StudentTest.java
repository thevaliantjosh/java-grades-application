package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student joshua = new Student("Joshua");
        joshua.addGrade(80);
        joshua.addGrade(72);
        joshua.addGrade(90);
        joshua.addGrade(85);
        joshua.addGrade(60);

        System.out.printf("%s's average is: %s%n", joshua.getName(), joshua.getGradeAverage());


    }
}
