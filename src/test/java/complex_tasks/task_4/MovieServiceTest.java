package complex_tasks.task_4;

import homework.complex_tasks.task_3.InvalidGradeException;
import homework.complex_tasks.task_4.Movie;
import homework.complex_tasks.task_4.MovieService;
import homework.complex_tasks.task_4.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    /**
     * Positive:
     * addRating:
     * "Inglorious Bastards", 2000, "Drama" ->  10, 8, 9, 9, 10
     * "Kill Bill", 2003, "Action" -> 10...
     * Negative:
     * Rating - 0 & 11
     * CalculateAverage:
     * -positive
     * -negative -> null or empty
     * Sorting:
     * positive
     *
     */

    private MovieService<Integer> service;

    @BeforeEach
    void setup() {
        service = new MovieService<>();
    }

    @ParameterizedTest
    @MethodSource("validRatings")
    void shouldAddValidRating(int ratingValue) {

        Movie movie = new Movie("Inglorious Bastards", 2009, "Drama");
        service.addRating(movie, new Rating<>(ratingValue));

        List<Rating<Integer>> actual = service.getMovieRating().get(movie);
        assertEquals(1, actual.size());
        assertEquals(ratingValue, actual.getFirst().getValue());

    }

    private static Stream<Arguments> validRatings() {
        return Stream.of(
                Arguments.of(10),
                Arguments.of(9),
                Arguments.of(8)
        );
    }

    @Test
    void shouldCalculateAvgRating() {
        Movie movie = new Movie("Casablanca", 1942, "Drama");
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie, new Rating<>(9));
        service.addRating(movie, new Rating<>(10));
        service.addRating(movie, new Rating<>(9));

        double actual = service.calculateAvgRating(movie);
        assertEquals(9.5, actual);
    }

    @Test
    void shouldSortMoviesByAverageRating() {
        Movie movie1 = new Movie("Casablanca", 1942, "Drama");
        Movie movie2 = new Movie("Inglorious Bastards", 2009, "Drama");
        Movie movie3 = new Movie("Kill Bill", 2003, "Action");

        service.addRating(movie1, new Rating<>(10));
        service.addRating(movie1, new Rating<>(1));
        service.addRating(movie1, new Rating<>(1));//4

        service.addRating(movie2, new Rating<>(8));
        service.addRating(movie2, new Rating<>(10));
        service.addRating(movie2, new Rating<>(8));
        service.addRating(movie2, new Rating<>(10));//9

        service.addRating(movie3, new Rating<>(10));
        service.addRating(movie3, new Rating<>(10));
        service.addRating(movie3, new Rating<>(10));//10

        List<Movie> actual = service.sortMoviesByAvgRating();
        assertEquals(movie3, actual.getFirst());
        assertEquals(movie2, actual.get(1));
        assertEquals(movie1, actual.get(2));
    }

    @ParameterizedTest
    @MethodSource("InvalidRatings")
    void shouldThrowExceptionWhenRatingIsInvalid(int ratingValue) {
        Movie movie = new Movie("Kill Bill", 2003, "Action");

        assertThrows(InvalidGradeException.class, () -> {
            service.addRating(movie, new Rating<>(ratingValue));
        });
    }

    private static Stream<Arguments> InvalidRatings() {
        return Stream.of(
                Arguments.of(0),
                Arguments.of(11),
                Arguments.of(-1)
        );
    }

    @Test
        //rating.isEmpty
    void shouldReturnZeroWhenMovieHasNoRatings() {
        Movie movie = new Movie("Saltburn", 2023, "Comedy/Thriller");
        double actual = service.calculateAvgRating(movie);
        assertEquals(0, actual);
    }

    @Test
    void shouldReturnEmptyListWhenNoMoviesExist(){
        List<Movie> actual = service.sortMoviesByAvgRating();
        assertTrue(actual.isEmpty());
    }
}
