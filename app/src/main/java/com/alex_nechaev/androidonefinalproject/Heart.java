package com.alex_nechaev.androidonefinalproject;

public class Heart extends GameObject implements SupplyElement{
    public Heart(float xPosition, float yPosition, int speed) {
        super(Bitmaps.heartImg, xPosition, yPosition, speed);
    }

    @Override
    public void move() {
        setYPosition(getYPosition() + speed);
        super.move();
    }

    @Override
    public void activateSupplyElement() {

    }
}
