import java.util.Arrays;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            // Create a list of movie durations in minutes.
            List<Integer> movieDurations = Arrays.asList(50, 110, 120, 260, 300, 200, 180);

            // Define the flight duration in minutes.
            Integer flightDuration = 250;

            // Create an instance of the MoviesFly class.
            MoviesFly moviesFly = new MoviesFly();

            // Find the best pair of movies to watch during the flight.
            List<Integer> bestPair = moviesFly.findBestMoviesPair(flightDuration, movieDurations);

            // Print the best pair of movies.
            System.out.println("The best pair of movies to watch during the flight are at positions: " + bestPair);
        }
    }
