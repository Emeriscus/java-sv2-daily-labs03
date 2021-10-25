package day01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class School {
    public static void main(String[] args) {

        Students students = new Students();

        students.addHeight(120);
        students.addHeight(150);
        students.addHeight(140);

        System.out.println(students.isHeightsIncreasing());
    }

}
