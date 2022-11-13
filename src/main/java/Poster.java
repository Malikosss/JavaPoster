public class Poster {
    private String[] movies = new String[0];
    private int maxNumberOfMovies = 10;

    public Poster(int maxNumberOfMovies) {

        this.maxNumberOfMovies = maxNumberOfMovies;
    }

    public Poster() {
    }


    public String[] findAll() {

        return movies;
    }

    public void findLast() {
        String[] tmp = new String[maxNumberOfMovies];
        for (int i = 0; i < maxNumberOfMovies; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        movies = tmp;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }

}
