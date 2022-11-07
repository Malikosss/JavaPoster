
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster repo = new Poster();
    String movie = new String("1");
    String movie2 = new String("2");
    String movie3 = new String("3");
    String movie4 = new String("4");
    String movie5 = new String("5");
    String movie6 = new String("6");
    String movie7 = new String("7");
    String movie8 = new String("8");
    String movie9 = new String("9");
    String movie10 = new String("10");
    String movie11 = new String("11");

    @Test
    public void setup() {
        repo.addMovie(movie);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
    }


    @Test
    public void showAllMovies() {
        Poster poster = new Poster();
        repo.addMovie(movie);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);

        String[] expected = {movie, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    ;

    @Test
    public void showLast10Movies() {
        Poster repo = new Poster(10);
        repo.addMovie(movie);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.addMovie(movie4);
        repo.addMovie(movie5);
        repo.addMovie(movie6);
        repo.addMovie(movie7);
        repo.addMovie(movie8);
        repo.addMovie(movie9);
        repo.addMovie(movie10);
        repo.addMovie(movie11);
        repo.findLast();
        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastTwo() {
        Poster repo = new Poster(2);
        repo.addMovie(movie);
        repo.addMovie(movie2);
        repo.addMovie(movie3);
        repo.findLast();
        String[] expected = {movie3, movie2};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addSeveralMovies() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");
        poster.addMovie("Movie2");
        poster.addMovie("Movie3");

        String[] actual = poster.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");

        String[] actual = poster.findAll();
        String[] expected = {"Movie1"};

        Assertions.assertArrayEquals(expected, actual);
    }


}

