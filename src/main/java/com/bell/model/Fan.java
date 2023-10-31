package com.bell.model;

public abstract class Fan {
    int speed;
    boolean isReverse;
    int maxSpeed;
    public int getFanSpeed() {return speed;}
    public boolean isFanDirectionReversed(){return isReverse;}
    public int getMaxFanSpeed(){return maxSpeed;}
    public Fan increaseSpeed(){
        speed = speed < maxSpeed ? ++speed : 0;
        return this;
    }

    public Fan reverseFanDirection(){
        isReverse = !isReverse;
        return this;
    }

}
