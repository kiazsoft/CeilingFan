package com.bell.model;

public class CeilingFan  {
    Motor motor;
    public CeilingFan(int maxSpeed){
        motor = new Motor(maxSpeed);
    }

    public CeilingFan pullSpeedCord(){
        motor.increaseSpeed();
        return this;
    }

    public CeilingFan pullDirectionCord(){
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
