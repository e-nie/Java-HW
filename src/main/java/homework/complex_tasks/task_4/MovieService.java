package homework.complex_tasks.task_4;

import homework.complex_tasks.task_3.InvalidGradeException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService<T extends Number> {
    private Map<Movie, List<Rating<T>>> movieRating = new HashMap<>();

    public Map<Movie, List<Rating<T>>> getMovieRating() {
        return movieRating;
    }

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        double ratingValue = rating.getValue().doubleValue();
        if (ratingValue < 1 || ratingValue > 10) {
            throw new InvalidGradeException("Rating must be between 1 and 10!");
        }
        movieRating.putIfAbsent(movie, new ArrayList<>());
        movieRating.get(movie).add(rating);
    }

    public double calculateAvgRating(Movie movie) {
        List<Rating<T>> ratings = movieRating.get(movie);
        if (ratings == null || ratings.isEmpty()) {
            return 0;
        }
        return ratings.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0);
    }

    public List<Movie> sortMoviesByAvgRating() {
        return movieRating.keySet()
                .stream()
                .sorted((m1, m2) -> Double.compare(
                        calculateAvgRating(m2),
                        calculateAvgRating(m1)
                ))
                .toList();

    }
}
