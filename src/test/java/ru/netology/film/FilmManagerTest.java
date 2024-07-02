package ru.netology.film;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shouldFindZeroTitles() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAllTitles() {

        FilmManager manager = new FilmManager();

        manager.addTitle("Бладшот");
        manager.addTitle("Вперёд");
        manager.addTitle("Отель Белград");
        manager.addTitle("Джентльмены");
        manager.addTitle("Человек-невидимка");
        manager.addTitle("Тролли. Мировой тур");
        manager.addTitle("Номер один");


        String[] expected = {"Бладшот", "Вперёд", "Отель Белград", "Джентльмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast5Titles() {

        FilmManager manager = new FilmManager();

        manager.addTitle("Бладшот");
        manager.addTitle("Вперёд");
        manager.addTitle("Отель Белград");
        manager.addTitle("Джентльмены");
        manager.addTitle("Человек-невидимка");
        manager.addTitle("Тролли. Мировой тур");
        manager.addTitle("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindLast3Titles() {

        FilmManager manager = new FilmManager(3);

        manager.addTitle("Бладшот");
        manager.addTitle("Вперёд");
        manager.addTitle("Отель Белград");
        manager.addTitle("Джентльмены");
        manager.addTitle("Человек-невидимка");
        manager.addTitle("Тролли. Мировой тур");
        manager.addTitle("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindLastMore7Titles() {

        FilmManager manager = new FilmManager(8);

        manager.addTitle("Бладшот");
        manager.addTitle("Вперёд");
        manager.addTitle("Отель Белград");
        manager.addTitle("Джентльмены");
        manager.addTitle("Человек-невидимка");
        manager.addTitle("Тролли. Мировой тур");
        manager.addTitle("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLimitTitles() {

        FilmManager manager = new FilmManager(7);

        manager.addTitle("Бладшот");
        manager.addTitle("Вперёд");
        manager.addTitle("Отель Белград");
        manager.addTitle("Джентльмены");
        manager.addTitle("Человек-невидимка");
        manager.addTitle("Тролли. Мировой тур");
        manager.addTitle("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}