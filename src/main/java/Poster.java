public class Poster {
    protected String[] movies = new String[0];
    protected int maxNumberOfMovies;

    public Poster() {
        this.maxNumberOfMovies = 10;
    }

    public Poster(int maxNumberOfMovies) {
        this.maxNumberOfMovies = maxNumberOfMovies;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast(int maxNumberOfMovies) {
        int reverseNumber;
        if (movies.length > maxNumberOfMovies) {
            reverseNumber = maxNumberOfMovies;
        } else {
            reverseNumber = movies.length;
        }

        String[] reverse = new String[reverseNumber];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = movies[movies.length - 1 - i];
        }
        return reverse;
    }
}
