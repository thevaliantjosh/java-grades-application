package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    //Getter for Grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }


    //return the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total/grades.size();
    }

    //Classic Syntax forLoop
//    public double getGradeAverage(){
//        double total = 0;
//        for (int i =0; i < grades.size(); i++){
//            total = total + grades.get(i);
//        }
//        return total/grades.size();
//    };

    //Constructors

    public Student(){
       this.name = "student";
       this.grades = new ArrayList<>();
    }
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }



}
