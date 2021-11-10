package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private List<String> names = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (studentName.contains(" ")) { // + trim : studentName.trim().contains(" ")
            names.add(studentName);
            System.out.println("A név megfelelő");
            return true;
        }
        System.out.println("A név nem megfelelő");
        return false;
    }

    public List<String> getNames() {
        return names;
//        return new ArrayList<>(names);        // elegánsabb getter megoldás, bár memória pazarlóbb...
    }

    @Override
    public String toString() {
        return "A naplóban szereplő nevek: " + names;
    }
}
