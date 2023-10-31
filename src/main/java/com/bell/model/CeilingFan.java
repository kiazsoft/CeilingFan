package com.bell.model;

public class CeilingFan extends Fan{
    public CeilingFan(int maxSpeed){
        this.speed = 0;
        this.isReverse = false;
        this.maxSpeed = maxSpeed;
    }

    public CeilingFan pullSpeedCord(){
        increaseSpeed();
        return this;
    }

    public CeilingFan pullDirectionCord(){
        reverseFanDirection();
        return this;
    }

    @Override
    public String toString() {
        return "Fan Current State: Speed=" + speed + ", isReverse="+isReverse + ", maxSpeed="+maxSpeed;
    }

}
