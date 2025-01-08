package az.abbtech.homework_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(String title) {
        movies.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title));
    }

    public List<Movie> searchByTitle(String title) {
        return movies.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<Movie> searchByDirector(String director) {
        return movies.stream()
                .filter(movie -> movie.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.toList());
    }

    public List<Movie> searchByGenre(String genre) {
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<Movie> displayMoviesSortedBy(String sortBy) {
        return movies.stream()
                .sorted((m1, m2) -> {
                    switch (sortBy.toLowerCase()) {
                        case "title":
                            return m1.getTitle().compareToIgnoreCase(m2.getTitle());
                        case "director":
                            return m1.getDirector().compareToIgnoreCase(m2.getDirector());
                        case "releaseyear":
                            return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
                        default:
                            throw new IllegalArgumentException("Invalid sort parameter: " + sortBy);
                    }
                })
                .collect(Collectors.toList());
    }

    public double calculateAverageReleaseYear() {
        return movies.stream()
                .mapToInt(Movie::getReleaseYear)
                .average()
                .orElse(0.0);
    }

    public long countMovies() {
        return movies.size();
    }
}
