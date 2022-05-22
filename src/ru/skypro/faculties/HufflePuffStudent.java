package ru.skypro.faculties;

import ru.skypro.HogwartsStudent;

public class HufflePuffStudent extends HogwartsStudent {

    private int diligence;
    private int fidelity;
    private int honesty;

    public HufflePuffStudent(String name, int magicPower, int magicTransgression, int diligence, int fidelity, int honesty) {
        super(name, magicPower, magicTransgression);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public static void studentsCompare(HufflePuffStudent hufflePuffStudentFirst, HufflePuffStudent hufflePuffStudentSecond) {
        int studentValueFirst = hufflePuffStudentFirst.diligence + hufflePuffStudentFirst.fidelity + hufflePuffStudentFirst.honesty;
        int studentValueSecond = hufflePuffStudentSecond.diligence + hufflePuffStudentSecond.fidelity + hufflePuffStudentSecond.honesty;

        if (studentValueFirst > studentValueSecond) {
            System.out.println(hufflePuffStudentFirst.getName() + " лучший Пуффендуец, чем " + hufflePuffStudentSecond.getName());
        } else if (studentValueFirst < studentValueSecond) {
            System.out.println(hufflePuffStudentSecond.getName() + " лучший Пуффендуец, чем " + hufflePuffStudentFirst.getName());
        } else if (studentValueFirst == studentValueSecond) {
            System.out.println(hufflePuffStudentSecond.getName() + " такой же хороший Пуффендуец, как " + hufflePuffStudentFirst.getName());
        }
    }

    @Override
    public String toString() {
        return "HufflePuffStudent{" +
                "diligence=" + diligence +
                ", fidelity=" + fidelity +
                ", honesty=" + honesty +
                '}';
    }
}
