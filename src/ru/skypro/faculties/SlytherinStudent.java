package ru.skypro.faculties;

import ru.skypro.HogwartsStudent;

public class SlytherinStudent extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerLust;

    public SlytherinStudent(String name, int magicPower, int magicTransgression,
                            int cunning, int determination, int ambition,
                            int resourcefulness, int powerLust) {
        super(name, magicPower, magicTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public static void studentsCompare(SlytherinStudent slytherinStudentFirst, SlytherinStudent slytherinStudentSecond) {
        int studentValueFirst = slytherinStudentFirst.cunning + slytherinStudentFirst.determination
                + slytherinStudentFirst.ambition + slytherinStudentFirst.resourcefulness + slytherinStudentFirst.powerLust;
        int studentValueSecond = slytherinStudentSecond.cunning + slytherinStudentSecond.determination
                + slytherinStudentSecond.ambition + slytherinStudentSecond.resourcefulness + slytherinStudentSecond.powerLust;

        if (studentValueFirst > studentValueSecond) {
            System.out.println(slytherinStudentFirst.getName() + " лучший Слизеринец, чем " + slytherinStudentSecond.getName());
        } else if (studentValueFirst < studentValueSecond) {
            System.out.println(slytherinStudentSecond.getName() + " лучший Слизеринец, чем " + slytherinStudentFirst.getName());
        } else if (studentValueFirst == studentValueSecond) {
            System.out.println(slytherinStudentSecond.getName() + " такой же хороший Слизеринец, как " + slytherinStudentFirst.getName());
        }
    }

    @Override
    public String toString() {
        return "SlytherinStudent{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", powerLust=" + powerLust +
                '}';
    }
}
