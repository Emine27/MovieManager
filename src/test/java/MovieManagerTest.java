import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    String film1 = "Бладшот";
    String film2 = "Вперед";
    String film3 = "Отель'Белград'";
    String film4 = "Джентельмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли. Мировой Тур";
    String film7 = "Номер один";
    String film8 = "Крименальное чтиво";
    String film9 = "Рассказ служанки";
    String film10 = "Человек швейцарский нож";
    String film11 = "Хоббит";


    @Test
    public void MovieTestFindAll1() {
        MovieManager manager = new MovieManager();
        manager.add(film1);


        String[] actual = manager.findAll();
        String[] expected = {film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindAll2() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindAll3() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindAll4() {
        MovieManager manager = new MovieManager();

        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findAll();
        String[] expected = {film8, film9, film10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindAll5() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film6);
        manager.add(film10);


        String[] actual = manager.findAll();
        String[] expected = {film1, film6, film10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastLimitMoreThanMovies() {
        MovieManager manager = new MovieManager(11);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLast() {
        MovieManager manager = new MovieManager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastLimitLessThanMovies1() {
        MovieManager manager = new MovieManager(9);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastLimitLessThanMovies2() {
        MovieManager manager = new MovieManager(8);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastLimitLessThanMovies3() {
        MovieManager manager = new MovieManager(2);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastLimitLessThanMovies4() {
        MovieManager manager = new MovieManager(1);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastDefaultLimit1() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastDefaultLimit2() {
        MovieManager manager = new MovieManager();

        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);


        String[] actual = manager.findLast();
        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastDefaultLimit3() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);


        String[] actual = manager.findLast();
        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastDefaultLimit4() {
        MovieManager manager = new MovieManager();
        manager.add(film1);
        manager.add(film2);


        String[] actual = manager.findLast();
        String[] expected = {film2, film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestFindLastDefaultLimit5() {
        MovieManager manager = new MovieManager();
        manager.add(film1);


        String[] actual = manager.findLast();
        String[] expected = {film1};
        assertArrayEquals(expected, actual);
    }


}