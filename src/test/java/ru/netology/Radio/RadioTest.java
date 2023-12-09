package ru.netology.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentRadio() {
        Radio rad = new Radio();
        rad.setCurrentRadio(4);

        int expected = 4;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


@Test
public void setCurrentRadioOverHigh() {
    Radio rad = new Radio(12);

    rad.setCurrentRadio(4);
    rad.setCurrentRadio(12);

    int expected = 4;
    int actual = rad.getCurrentRadio();

    Assertions.assertEquals(expected, actual);
}


    @Test
    public void currentRadioMax() {
        Radio rad = new Radio();
        rad.setCurrentRadio(10);

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextRadioOverHigh() {
        Radio rad = new Radio(12);

        rad.setCurrentRadio(11);
        rad.nextRadio();

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextRadio() {
        Radio rad = new Radio();
        rad.setCurrentRadio(4);

        rad.nextRadio();

        int expected = 5;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextRadio8() {
        Radio rad = new Radio();
        rad.setCurrentRadio(8);

        rad.nextRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextRadio9() {
        Radio rad = new Radio();
        rad.setCurrentRadio(9);

        rad.nextRadio();

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevRadio1() {
        Radio rad = new Radio();
        rad.setCurrentRadio(1);

        rad.prevRadio();

        int expected = 0;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevRadioMinus() {
        Radio rad = new Radio();
        rad.setCurrentRadio(-1);

        rad.prevRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevRadioZero() {
        Radio rad = new Radio();
        rad.setCurrentRadio(0);

        rad.prevRadio();

        int expected = 9;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPrevRadioZeroOverLimit() {
        Radio rad = new Radio(15);

        rad.setCurrentRadio(0);
        rad.prevRadio();

        int expected = 14;
        int actual = rad.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void currentVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(200);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolumeOver100() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume50() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);

        rad.increaseVolume();

        int expected = 51;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void increaseVolume99() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeZero() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseVolumeMinus() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
