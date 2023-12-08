package ru.netology.Radio;

public class Radio {

    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {

        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio > 9) {
            return;
        }
        if (currentRadio < 0) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void nextRadio() {

        if (currentRadio == 9) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevRadio() {

        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio = currentRadio - 1;
        }
    }


    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
