package com.alex_nechaev.androidonefinalproject;


public class GreenAlien extends GameObject {

    boolean direction = true;

    public GreenAlien(float xPosition, float yPosition, int speed) {
        super(Bitmaps.greenAlienImg, xPosition, yPosition, speed);
    }

    public float getRightBorder() {
        return getXPosition() + getSpriteWidth();
    }

    public float getLeftBorder() {
        return getXPosition();
    }

    public float getTopBorder() {
        return getYPosition();
    }

    public float getBottomBorder() {
        return getYPosition() + getSpriteHeight();
    }

    @Override
    public void move() {
        if (direction && getRightBorder() < MainActivity.SCREEN_WIDTH) {
            setXPosition(getXPosition() + 10);
        } else if (!direction && getLeftBorder() > 0) {
            setXPosition(getXPosition() - 10);
        }
        if (getRightBorder() >= MainActivity.SCREEN_WIDTH) {
            direction = false;
        } else if (getLeftBorder() <= 0) {
            direction = true;
        }
        setYPosition(getYPosition() + speed);
    }
}