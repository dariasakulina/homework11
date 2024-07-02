package ru.netology.film;

public class FilmManager {

    private String[] titles = new String[0];

    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addTitle(String title) {
        String[] tmp = new String[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            tmp[i] = titles[i];
        }
        tmp[tmp.length - 1] = title;
        titles = tmp;
    }

    public String[] findAll() {
        return titles;
    }

    public String[] findLast() {
        int resultLength;
        if (titles.length < limit) {
            resultLength = titles.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = titles[titles.length - 1 - i];
        }
        return tmp;
    }
}