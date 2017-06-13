package com.app.strkita.anbayashiroulette;

/**
 *
 * Created by strkita on 2017/06/13.
 */

public class AnbayashiData {
    private int number;
    private int addition;
    private String comment;

    public AnbayashiData(int number, int addition, String comment) {
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return addition;
    }

    public String getComment() {
        return comment;
    }

}
