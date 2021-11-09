package day05;

public class JournalMain {
    public static void main(String[] args) {

        Journal journal = new Journal();

        journal.addStudent("Madonna");
        System.out.println(journal);

        journal.addStudent("Pocsai Imre");
        System.out.println(journal);

        journal.addStudent("Imre");
        System.out.println(journal);

        journal.addStudent("Pál Imre");
        System.out.println(journal);

        journal.addStudent("Pici Kálmán");
        System.out.println(journal.toString());

        for (String actual : journal.getNames()) {
            System.out.println(actual);
        }

        for (String actual : journal.getNames()) {
            System.out.print(actual + ", ");
        }
    }
}
