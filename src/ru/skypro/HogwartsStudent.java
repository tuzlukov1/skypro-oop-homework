package ru.skypro;

import ru.skypro.faculties.SlytherinStudent;

public class HogwartsStudent {
    private String name;
    private int magicPower;
    private int magicTransgression;

    public HogwartsStudent(String name, int magicPower, int magicTransgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.magicTransgression = magicTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getMagicTransgression() {
        return magicTransgression;
    }

    public void setMagicTransgression(int magicTransgression) {
        this.magicTransgression = magicTransgression;
    }

    public static void studentsCompare(HogwartsStudent hogwartsStudentFirst, HogwartsStudent hogwartsStudentSecond) {
        int studentValueFirst = hogwartsStudentFirst.magicPower + hogwartsStudentFirst.magicTransgression;
        int studentValueSecond = hogwartsStudentSecond.magicPower + hogwartsStudentSecond.magicTransgression;

        if (studentValueFirst > studentValueSecond) {
            System.out.println((hogwartsStudentFirst.getName() + " имеет бОльшую магическую силу, чем " + hogwartsStudentSecond.getName()));
        } else if (studentValueFirst < studentValueSecond) {
            System.out.println(hogwartsStudentFirst.getName() + " имеет бОльшую магическую силу, чем " + hogwartsStudentSecond.getName());
        } else if (studentValueFirst == studentValueSecond) {
            System.out.println(hogwartsStudentFirst.getName() + " имеет такую же магическую силу, как " + hogwartsStudentSecond.getName());
        }
    }
}
