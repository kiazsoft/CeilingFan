package com.bell.Model;

public class TableFan extends Fan{
    public TableFan(int maxSpeed){
        this.speed = 0;
        this.isReverse = false;
        this.maxSpeed = maxSpeed;
    }

    public TableFan pressSpeedButton(){
        increaseSpeed();
        return this;
    }

    public TableFan pressDirectionButton(){
        reverseFanDirection();
        return this;
    }

    @Override
    public String toString() {
        return "Fan Current State: Speed=" + speed + ", isReverse="+isReverse + ", maxSpeed="+maxSpeed;
    }

}
