package com.bell.model;

public class TableFan {
    Motor motor;
    public TableFan(int maxSpeed){
        motor = new Motor(maxSpeed);
    }

    public TableFan pressSpeedButton(){
        motor.increaseSpeed();
        return this;
    }

    public TableFan pressDirectionButton(){
       motor.reverseFanDirection();
        return this;
    }
    public int getFanSpeed(){
        return motor.getFanSpeed();
    }

    public boolean isFanDirectionReversed(){
        return motor.isFanDirectionReversed();
    }
    @Override
    public String toString() {
        return "Fan Current State: Speed=" + motor.getFanSpeed() + ", isReverse="+motor.isFanDirectionReversed() + ", maxSpeed="+motor.getMaxFanSpeed();
    }

}
