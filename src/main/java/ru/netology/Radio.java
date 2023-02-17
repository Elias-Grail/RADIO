package ru.netology;

public class Radio {

    private int currentStantion;
    private int currentVolume;
    private int maxStantion;

    public Radio() {

        maxStantion = 9;

    }

    public Radio(int count) {

        maxStantion = count - 1;
    }

    public int getCurrentStation() {

        return currentStantion;
    }

    public void setCurrentStantion(int currentStantion) {
        if (currentStantion < 0) {
            return;
        }

        if (currentStantion > maxStantion) {
            return;
        }
        this.currentStantion = currentStantion;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }

        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStantion != maxStantion) {
            currentStantion++;
        } else {
            currentStantion = 0;
        }
    }

    public void prev() {
        if (currentStantion != 0) {
            currentStantion--;
        } else {
            currentStantion = 0;
        }
    }
}
