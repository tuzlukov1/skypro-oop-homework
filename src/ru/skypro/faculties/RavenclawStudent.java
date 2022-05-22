package ru.skypro.faculties;

import ru.skypro.HogwartsStudent;

public class RavenclawStudent extends HogwartsStudent {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magicPower, int magicTransgression,
                            int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, magicTransgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public static void studentsCompare(RavenclawStudent ravenclawStudentFirst, RavenclawStudent ravenclawStudentSecond) {
        int studentValueFirst = ravenclawStudentFirst.intelligence + ravenclawStudentFirst.wisdom
                + ravenclawStudentFirst.wit + ravenclawStudentFirst.creativity;
        int studentValueSecond = ravenclawStudentSecond.intelligence + ravenclawStudentSecond.wisdom
                + ravenclawStudentSecond.wit + ravenclawStudentSecond.creativity;

        if (studentValueFirst > studentValueSecond) {
            System.out.println(ravenclawStudentFirst.getName() + " лучший Когтевранец, чем " + ravenclawStudentSecond.getName());
        } else if (studentValueFirst < studentValueSecond) {
            System.out.println(ravenclawStudentSecond.getName() + " лучший Когтевранец, чем " + ravenclawStudentFirst.getName());
        } else if (studentValueFirst == studentValueSecond) {
            System.out.println(ravenclawStudentSecond.getName() + " такой же хороший Когтевранец, как " + ravenclawStudentFirst.getName());
        }
    }

    @Override
    public String toString() {
        return "RavenclawStudent{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
