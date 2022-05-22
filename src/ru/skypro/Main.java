package ru.skypro;

import ru.skypro.faculties.GriffindorStudent;
import ru.skypro.faculties.HufflePuffStudent;
import ru.skypro.faculties.RavenclawStudent;
import ru.skypro.faculties.SlytherinStudent;
import ru.skypro.utils.Random;

public class Main {

    public static void main(String[] args) {
        Random value = new Random();
        GriffindorStudent[] griffindorStudents = {
                new GriffindorStudent("Гарри Поттер", value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue()),
                new GriffindorStudent("Гермиона Грейнджер", value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue()),
                new GriffindorStudent("Рон Уизли", value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue(), value.getRandomValue(),
                                                            value.getRandomValue())
        };

        HufflePuffStudent[] hufflePuffStudents = {
                new HufflePuffStudent("Захария Смит", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue()),
                new HufflePuffStudent("Седрик Диггори", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue()),
                new HufflePuffStudent("Джастин Финч-Флетчли", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue())
        };

        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Чжоу Чанг", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue()),
                new RavenclawStudent("Падма Патил", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue()),
                new RavenclawStudent("Маркус Белби", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue())
        };

        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent("Драко Малфой", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(), value.getRandomValue()),
                new SlytherinStudent("Грэхэм Монтегю", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(), value.getRandomValue()),
                new SlytherinStudent("Грегори Гойл", value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(),
                        value.getRandomValue(), value.getRandomValue(), value.getRandomValue())
        };

        GriffindorStudent.studentsCompare(griffindorStudents[0], griffindorStudents[1]);
        HufflePuffStudent.studentsCompare(hufflePuffStudents[0], hufflePuffStudents[1]);
        RavenclawStudent.studentsCompare(ravenclawStudents[0], ravenclawStudents[1]);
        SlytherinStudent.studentsCompare(slytherinStudents[0], slytherinStudents[1]);

        HogwartsStudent.studentsCompare(griffindorStudents[0], slytherinStudents[0]);
    }
}
