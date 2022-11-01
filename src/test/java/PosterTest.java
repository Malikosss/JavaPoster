import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PosterTest {

    @Test
    public void addSeveralMovies() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");
        poster.addMovie("Movie2");
        poster.addMovie("Movie3");

        String[] actual = poster.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");

        String[] actual = poster.findAll();
        String[] expected = {"Movie1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast11Movies() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");
        poster.addMovie("Movie2");
        poster.addMovie("Movie3");
        poster.addMovie("Movie4");
        poster.addMovie("Movie5");
        poster.addMovie("Movie6");
        poster.addMovie("Movie7");
        poster.addMovie("Movie8");
        poster.addMovie("Movie9");
        poster.addMovie("Movie10");
        poster.addMovie("Movie11");


        String[] actual = poster.findLast(11);
        String[] expected = {
                "Movie11",
                "Movie10",
                "Movie9",
                "Movie8",
                "Movie7",
                "Movie6",
                "Movie5",
                "Movie4",
                "Movie3",
                "Movie2",
                "Movie1"
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast7Movies() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");
        poster.addMovie("Movie2");
        poster.addMovie("Movie3");
        poster.addMovie("Movie4");
        poster.addMovie("Movie5");
        poster.addMovie("Movie6");
        poster.addMovie("Movie7");
        poster.addMovie("Movie8");
        poster.addMovie("Movie9");
        poster.addMovie("Movie10");
        poster.addMovie("Movie11");

        String[] actual = poster.findLast(3);
        String[] expected = {
                "Movie11",
                "Movie10",
                "Movie9",
        };

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showMaxPossibleMovies() {
        Poster poster = new Poster();
        poster.addMovie("Movie1");
        poster.addMovie("Movie2");
        poster.addMovie("Movie3");
        poster.addMovie("Movie4");
        poster.addMovie("Movie5");
        poster.addMovie("Movie6");
        poster.addMovie("Movie7");
        poster.addMovie("Movie8");
        poster.addMovie("Movie9");
        poster.addMovie("Movie10");
        poster.addMovie("Movie11");

        String[] actual = poster.findLast(15);
        String[] expected = {

                "Movie11",
                "Movie10",
                "Movie9",
                "Movie8",
                "Movie7",
                "Movie6",
                "Movie5",
                "Movie4",
                "Movie3",
                "Movie2",
                "Movie1"
        };


        assertArrayEquals(expected, actual);
    }
}