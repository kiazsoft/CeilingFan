package com.bell.model;

public class Motor {
    private int speed;
    private boolean isReverse;
    private int maxSpeed;

    Motor(int maxSpeed){
        this.maxSpeed = maxSpeed;
        this.isReverse = false;
        this.speed = 0;
    }
    public int getFanSpeed() {return speed;}
    public boolean isFanDirectionReversed(){return isReverse;}
    public int getMaxFanSpeed(){return maxSpeed;}
    public Motor increaseSpeed(){
        speed = speed < maxSpeed ? ++speed : 0;
        return this;
    }

    public Motor reverseFanDirection(){
        isReverse = !isReverse;
        return this;
    }

}
