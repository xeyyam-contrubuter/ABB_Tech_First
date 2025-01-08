package az.abbtech.homework_10;

class Movie {
    private String title;
    private String director;
    private String genre;
    private int releaseYear;

    public Movie(String title, String director, String genre, int releaseYear) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return String.format("Movie{title='%s', director='%s', genre='%s', releaseYear=%d}",
                title, director, genre, releaseYear);
    }
}
