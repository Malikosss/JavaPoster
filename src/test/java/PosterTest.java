
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster repo = new Poster();
    

    PurchaseMovie film = new PurchaseMovie(1, "movie");
    PurchaseMovie film2 = new PurchaseMovie(2, "movie2");
    PurchaseMovie film3 = new PurchaseMovie(3, "Maska");
    PurchaseMovie film4 = new PurchaseMovie(4, "Up!");
    PurchaseMovie film5 = new PurchaseMovie(5, "Friends");
    PurchaseMovie film6 = new PurchaseMovie(6, "Doctor House");
    PurchaseMovie film7 = new PurchaseMovie(7, "Avatar");
    PurchaseMovie film8 = new PurchaseMovie(8, "Blandshop");
    PurchaseMovie film9 = new PurchaseMovie(9, "Trolls");
    PurchaseMovie film10 = new PurchaseMovie(10, "Humans");
    PurchaseMovie film11 = new PurchaseMovie(11, "Office");


    @Test
    public void setup() {
        repo.addMovie("movie");
        repo.addMovie("movie2");
        repo.addMovie("movie3");
        repo.addMovie("movie4");
        repo.addMovie("movie5");
        repo.addMovie("movie6");
        repo.addMovie("movie7");
        repo.addMovie("movie8");
        repo.addMovie("movie9");
        repo.addMovie("movie10");
        repo.addMovie("movie11");
    }


    @Test
    public void showAllMovies() {
        Poster poster = new Poster();
        repo.addMovie("movie");
        repo.addMovie("movie2");
        repo.addMovie("movie3");
        repo.addMovie("movie4");
        repo.addMovie("movie5");
        repo.addMovie("movie6");
        repo.addMovie("movie7");
        repo.addMovie("movie8");
        repo.addMovie("movie9");
        repo.addMovie("movie10");
        repo.addMovie("movie11");

        String[] expected = {"movie", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10", "movie11"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    ;

    @Test
    public void showLast10Movies() {
        Poster repo = new Poster(10);
        repo.addMovie("movie");
        repo.addMovie("movie2");
        repo.addMovie("movie3");
        repo.addMovie("movie4");
        repo.addMovie("movie5");
        repo.addMovie("movie6");
        repo.addMovie("movie7");
        repo.addMovie("movie8");
        repo.addMovie("movie9");
        repo.addMovie("movie10");
        repo.addMovie("movie11");
        repo.findLast();
        String[] expected = {"movie11", "movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastTwo() {
        Poster repo = new Poster(2);
        repo.addMovie("movie");
        repo.addMovie("movie2");
        repo.addMovie("movie3");
        repo.findLast();
        String[] expected = {"movie3", "movie2"};
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

