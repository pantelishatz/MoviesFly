import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoviesFly {

    public List<Integer> findBestMoviesPair(Integer flightDuration, List<Integer> movies) {
        Integer maxDuration = null;
        List<Integer> bestPair = new ArrayList<>();

        // check if the flight duration is empty and if its duration is less than 30. Also, if the list of movies is empty.
        if (flightDuration == null || movies.isEmpty() || flightDuration <= 30) {
            return bestPair;
        }
        flightDuration = flightDuration - 30;


        // Iterate over the movies list.
        for (int i = 0; i < movies.size(); i++) {
            // For each movie, iterate over the remaining movies.
            for (int j = i + 1; j < movies.size(); j++) {
                // Calculate the total duration of the two movies.
                int duration = movies.get(i) + movies.get(j);

                // If the total duration is less than or equal to the flight duration and greater than the current max duration,
                // this pair of movies becomes the new best pair.
                if (duration <= flightDuration && (maxDuration == null || duration > maxDuration)) {
                    maxDuration = duration;
                    bestPair = List.of(i, j);
                }
            }
        }
        if (bestPair.isEmpty()) {
            // if no pair is found find the longest movie duration watchable
            List<Integer> moviesSort = new ArrayList<>();
           for (int i = 0; i < movies.size(); i++) {
               if (movies.get(i) <= flightDuration) {
                   // keep only romoves sorter than the flight duration
                   moviesSort.add(movies.get(i));
               }
           }
           // get the longest movie
           Collections.sort(moviesSort,Collections.reverseOrder());
           bestPair.add(0);
        }

        // Return the best pair of movies after iterating over the whole list.
        return bestPair;
    }
}