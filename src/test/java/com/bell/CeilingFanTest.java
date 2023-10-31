package com.bell;

import com.bell.model.CeilingFan;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CeilingFanTest extends TestCase
{
    private CeilingFan ceilingFan;

    @Before
    public void setUp() throws Exception {
        ceilingFan = new CeilingFan(3);
    }

    @Test
    public void testForSpeed_Initial_NotReversed( )
    {
        ceilingFan.pullSpeedCord();
        assertEquals(1, ceilingFan.getFanSpeed());
        assertEquals(false, ceilingFan.isFanDirectionReversed());
    }

    public void testForSpeed_Max_Reversed( )
    {
        ceilingFan.pullSpeedCord()
            .pullSpeedCord()
            .pullSpeedCord()
            .pullDirectionCord();
        assertEquals(3, ceilingFan.getFanSpeed());
        assertEquals(true, ceilingFan.isFanDirectionReversed());
    }

    public void testForSpeed_Reset( )
    {
        ceilingFan.pullSpeedCord()
            .pullSpeedCord()
            .pullSpeedCord()
            .pullSpeedCord();
        assertEquals(0, ceilingFan.getFanSpeed());
    }

    public void testForSpeed_3_Reversed_NotReversed( )
    {
        ceilingFan.pullSpeedCord()
            .pullSpeedCord()
            .pullSpeedCord()
            .pullDirectionCord()
            .pullDirectionCord();
        assertEquals(3, ceilingFan.getFanSpeed());
        assertEquals(false, ceilingFan.isFanDirectionReversed());
    }
}
