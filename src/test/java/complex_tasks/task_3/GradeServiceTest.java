package complex_tasks.task_3;

import homework.complex_tasks.task_3.GradeService;
import homework.complex_tasks.task_3.InvalidGradeException;
import homework.complex_tasks.task_3.StudentGrade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    /**
     * AddGrade
     * Positive:
     * "Ann", "Math", 5 -> add to empty list
     * "Bob", "Math", 4 -> add another element
     * "Lea", "Math", 0 -> add another element
     * Negative:
     * "Eva", "Math", -3 -> Invalid Grade Exception
     * <p>
     * calculateAvgGrade:
     * "Ann", "Math", 5
     * "Bob", "Math", 4
     * "Lea", "Math", 0 ->  avg 3
     */

    @ParameterizedTest
    @MethodSource("addGradeTestData")
    void shouldAddValidGrades(int gradeValue) {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("Eva", "Deutsch", gradeValue);
        service.addGrade(grade);
        List<StudentGrade<Integer>> actual = service.getGradesList();

        assertEquals(1, actual.size());
        assertEquals(grade, actual.getFirst());
    }

    private static Stream<Arguments> addGradeTestData() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(5),
                Arguments.of(3)
        );
    }


    @ParameterizedTest
    @MethodSource("avgGradeTestData")
    void shouldCalculateAvgGrade(List<StudentGrade<Integer>> grades, double expected) {
        GradeService<Integer> service = new GradeService<>();

        for (StudentGrade<Integer> grade : grades) {
            service.addGrade(grade);
        }
        double actual = service.calculateAvgGrade();
        assertEquals(expected, actual);
    }


    private static Stream<Arguments> avgGradeTestData() {
        return Stream.of(

                Arguments.of(
                        List.of(
                                new StudentGrade<Integer>("Ann", "Math", 5),
                                new StudentGrade<Integer>("Bob", "Math", 4),
                                new StudentGrade<Integer>("Lea", "Math", 0)

                        ),
                        3.0
                ),
                Arguments.of(
                        List.of(
                                new StudentGrade<Integer>("Ann", "Chemie", 5),
                                new StudentGrade<Integer>("Bob", "Chemie", 2),
                                new StudentGrade<Integer>("Lea", "Chemie", 5)

                        ),
                        4.0
                )
        );

    }

    @Test
    void shouldThrowExceptionWhenGradeIsNegative() {
        GradeService<Integer> service = new GradeService<>();
        StudentGrade<Integer> grade = new StudentGrade<>("Eva", "Math", -3);

        assertThrows(InvalidGradeException.class, ()->{
            service.addGrade(grade);
        });
    }
}