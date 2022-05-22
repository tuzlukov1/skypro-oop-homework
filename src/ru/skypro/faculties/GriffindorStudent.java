package ru.skypro.faculties;

import ru.skypro.HogwartsStudent;

public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String name, int magicPower, int magicTransgression, int nobility, int honor, int courage) {
        super(name, magicPower, magicTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public static void studentsCompare(GriffindorStudent griffindorStudentFirst, GriffindorStudent griffindorStudentSecond) {
        int studentValueFirst = griffindorStudentFirst.courage + griffindorStudentFirst.honor + griffindorStudentFirst.nobility;
        int studentValueSecond = griffindorStudentSecond.courage + griffindorStudentSecond.honor + griffindorStudentSecond.nobility;

        if (studentValueFirst > studentValueSecond) {
            System.out.println(griffindorStudentFirst.getName() + " лучший Гриффиндорец, чем " + griffindorStudentSecond.getName());
        } else if (studentValueFirst < studentValueSecond) {
            System.out.println(griffindorStudentSecond.getName() + " лучший Гриффиндорец, чем " + griffindorStudentFirst.getName());
        } else if (studentValueFirst == studentValueSecond) {
            System.out.println(griffindorStudentSecond.getName() + " такой же хороший Гриффиндорец, как " + griffindorStudentFirst.getName());
        }
    }

    @Override
    public String toString() {
        return "GriffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
