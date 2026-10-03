package Projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Score(String name, int points) {

    static List<String> aboveAverage(List<Score> scores) {
        double average = scores.stream()
                .mapToInt(Score::points)
                .average()
                .orElse(0.0);

        return scores.stream()
                .filter(s -> s.points() > average)
                .sorted(Comparator.comparingInt(Score::points)
                        .reversed()
                        .thenComparing(Score::name))
                .map(Score::name)
                .toList();
    }
}
