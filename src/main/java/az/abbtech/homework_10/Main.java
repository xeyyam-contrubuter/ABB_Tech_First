package az.abbtech.homework_10;

public class Main {
    public static void main(String[] args) {
        MovieLibrary library = new MovieLibrary();

        library.addMovie(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010));
        library.addMovie(new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008));
        library.addMovie(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014));
        library.addMovie(new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 1994));

        System.out.println("\nAll movies sorted by title:");
        library.displayMoviesSortedBy("title").forEach(System.out::println);

        System.out.println("\nSearch for movies by director (Christopher Nolan):");
        library.searchByDirector("Christopher Nolan").forEach(System.out::println);

        System.out.println("\nAverage release year:");
        System.out.println(library.calculateAverageReleaseYear());

        System.out.println("\nCount of movies in library:");
        System.out.println(library.countMovies());

        System.out.println("\nRemoving movie: Interstellar");
        library.removeMovie("Interstellar");

        System.out.println("\nAll movies after removal:");
        library.displayMoviesSortedBy("title").forEach(System.out::println);
    }
}

