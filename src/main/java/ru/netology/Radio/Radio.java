package ru.netology.Radio;

public class Radio {

    private int currentRadio;
    private int currentVolume;
    private int maxStation = 10;
    public int getCurrentRadio() {

        return currentRadio;
    }

public Radio(int maxStation) {
        this.maxStation = maxStation;
}

public Radio() {

}

    public void setCurrentRadio(int currentRadio) {
        if (currentRadio > maxStation - 1) {
            return;
        }
        if (currentRadio < 0) {
            return;
        }
        this.currentRadio = currentRadio;
    }

    public void nextRadio() {

        if (currentRadio == maxStation - 1) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevRadio() {

        if (currentRadio == 0) {
            currentRadio = maxStation - 1;
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
