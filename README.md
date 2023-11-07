# Implementation of Ceiling Fan


Junit tests provided for CeilingFan functionality - `CeilingFanTest.java`

Ceiling Fan has 2 interfaces

`pullSpeedCord`

Increases the speed each time it is pulled.  
There are 3 speed settings, and an “off” (speed 0) setting.
If the cord is pulled on speed 3, the fan returns to the “off” setting

`pullDirectionCord`

Reverses the direction of the fan at the current speed setting. 
Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.


## How to build application

`mvn clean install`


