package main.java.com.kgk.basic;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {

    public static void test(){
        List<Integer> grades = new ArrayList<>();
        grades.add(40);
        grades.add(41);
        grades.add(42);
        grades.add(43);
        grades.add(44);
        grades.add(45);
        grades.add(46);
        grades.add(47);
        grades.add(48);
        grades.add(49);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> result = gradingStudents(grades);
        result.forEach(System.out::println);
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> roundedGrades = new ArrayList<>();

        grades.forEach(x -> {
            if(x < 38 || (x % 5 == 0) || ((x + 2) % 5 > 2)) {
                roundedGrades.add(x);
            }
//            }else if(x % 5 == 0){
//                roundedGrades.add(x);
//
//            }else if((x + 2) % 5 > 2){
//                roundedGrades.add(x);
//            }
            else{
                roundedGrades.add(x + (5 - x%5));
            }
        });

        return roundedGrades;
    }
}
